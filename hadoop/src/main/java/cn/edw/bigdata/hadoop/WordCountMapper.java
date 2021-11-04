package cn.edw.bigdata.hadoop;

import com.google.common.base.Strings;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author taoxu.xu
 * @date 11/4/2021 8:10 PM
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String string = value.toString();
        if (!Strings.isNullOrEmpty(string)){
            String[] strArr = string.trim().split(" +");
            for (String s : strArr) {
                context.write(new Text(s), new IntWritable(1));
            }
        }
    }
}
