package cn.edw.bigdata.spark.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
;

/**
 * @author taoxu.xu
 * @date 1/5/2022 12:12 AM
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val path:String = "D:\\tmp\\log.txt"

    // 创建运行配置
    val sparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("WordCount")
    // 创建上下文环境对象
    val sc:SparkContext = new SparkContext(sparkConf);
    // 读取文件数据
    val fileRDD:RDD[String] = sc.textFile(path);
    // 分词
    val wordRDD :RDD[String] = fileRDD.flatMap(_.split(" "))
    // 转map
    val word2OneRDD:RDD[(String, Int)] = wordRDD.map((_,1))
    // 分组聚合
    val word2CountRDD:RDD[(String, Int)] = word2OneRDD.reduceByKey(_+_);
    // 将数据聚合结果采集到内存中
    val word2Count:Array[(String, Int)] = word2CountRDD.collect()
    // 打印
    word2Count.foreach(println)
    // 关闭spark连接
    sc.stop()
  }
}
