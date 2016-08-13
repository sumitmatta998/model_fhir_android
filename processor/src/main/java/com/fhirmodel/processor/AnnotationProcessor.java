package com.fhirmodel.processor;

import com.fhirmodel.annotation.Resource;
import com.fhirmodel.processor.util.Log;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
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
        Set<String> set = new HashSet<>();
        set.add(Resource.class.getCanonicalName());
        Log.note("getSupportedAnnotationTypes" + set);
        return set;
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Log.note("process");
        for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(Resource.class)) {
            Log.note("process simple Name " + annotatedElement.getSimpleName());
        }
        return false;
    }
}
