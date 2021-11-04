package cn.edw.bigdata.hadoop;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author taoxu.xu
 * @date 11/4/2021 8:32 PM
 */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        AtomicInteger cnt = new AtomicInteger();
        values.forEach(val -> {
            cnt.addAndGet(val.get());
        });
        context.write(key, new IntWritable(cnt.get()));
    }
}
