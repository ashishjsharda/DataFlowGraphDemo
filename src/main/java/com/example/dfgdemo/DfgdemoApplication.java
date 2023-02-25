package com.example.dfgdemo;


import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.values.PCollection;

public class DfgdemoApplication {

    public static void main(String[] args) {
       Pipeline pipeline = Pipeline.create(PipelineOptionsFactory.create());
        PCollection<Integer> numbers = pipeline.apply(Create.of(1, 2, 3, 4, 5));

    }

}
