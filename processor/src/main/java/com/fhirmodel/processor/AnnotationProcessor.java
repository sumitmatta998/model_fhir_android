package com.fhirmodel.processor;

import com.fhirmodel.processor.util.Log;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.HashSet;
import java.util.Set;

public class AnnotationProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        Log.init(processingEnv.getMessager());
        Log.note("init");
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        Log.note("getSupportedSourceVersion");
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> set = new HashSet<String>();
        set.add("JsonObject");
        Log.note("getSupportedAnnotationTypes" + set);
        return set;
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Log.note("process");
        return false;
    }
}
