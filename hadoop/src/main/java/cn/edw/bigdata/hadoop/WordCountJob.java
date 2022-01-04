package cn.edw.bigdata.hadoop;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author taoxu.xu
 * @date 11/4/2021 6:56 PM
 */
public class WordCountJob {
    public void countWords(String input , String output){
        try {
            Job job = Job.getInstance();
            job.setJarByClass(WordCountJob.class);

            job.setMapperClass(WordCountMapper.class);
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(IntWritable.class);

            job.setReducerClass(WordCountReducer.class);
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);

            FileInputFormat.setInputPaths(job, new Path(input));
            FileOutputFormat.setOutputPath(job, new Path(output));
            boolean waitForCompletion = job.waitForCompletion(true);
            System.out.println("Count Words " + (waitForCompletion ? "SUCCEEDED." : "FAILED."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordCountJob job = new WordCountJob();
        if (args.length < 2){
            System.out.println("Please input source filepath and target filepath!");
            System.exit(-1);
        }
        job.countWords(args[0], args[1]);
    }
}
