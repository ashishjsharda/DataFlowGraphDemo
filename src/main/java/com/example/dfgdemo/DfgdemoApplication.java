package com.example.dfgdemo;


import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TypeDescriptors;

public class DfgdemoApplication {

    public static void main(String[] args) {
       Pipeline pipeline = Pipeline.create(PipelineOptionsFactory.create());
       PCollection<Integer> numbers = pipeline.apply(Create.of(1, 2, 3, 4, 5));
       PCollection<String> strings = numbers.apply(MapElements.into(TypeDescriptors.strings()).via((Integer i) -> i.toString()));
       strings.apply(TextIO.write().to("output.txt"));
       pipeline.run();

    }

}
