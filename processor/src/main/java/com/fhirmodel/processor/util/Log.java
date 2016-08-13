package com.fhirmodel.processor.util;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

public class Log {
    private static Messager messager;

    public static void init(Messager msgr) {
        messager = msgr;
    }

    public static final Diagnostic.Kind OTHER = Diagnostic.Kind.OTHER;
    public static final Diagnostic.Kind NOTE = Diagnostic.Kind.NOTE;
    public static final Diagnostic.Kind WARNING = Diagnostic.Kind.WARNING;
    public static final Diagnostic.Kind MANDATORY_WARNING = Diagnostic.Kind.MANDATORY_WARNING;
    public static final Diagnostic.Kind ERROR = Diagnostic.Kind.ERROR;


    private static final Diagnostic.Kind LOGGING_MODE = NOTE;

    private static boolean isLoggable(Diagnostic.Kind mode) {
        return mode.compareTo(LOGGING_MODE) >= 0;
    }

    public static void other(CharSequence msg) {
        if (isLoggable(OTHER))
            printMessage(OTHER, msg);
    }

    public static void other(CharSequence msg, Element e) {
        if (isLoggable(OTHER))
            printMessage(OTHER, msg, e);
    }

    public static void other(CharSequence msg, Element e, AnnotationMirror a) {
        if (isLoggable(NOTE))
            printMessage(OTHER, msg, e, a);
    }

    public static void other(CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        if (isLoggable(OTHER))
            printMessage(OTHER, msg, e, a, v);
    }

    public static void note(CharSequence msg) {
        if (isLoggable(NOTE))
            printMessage(NOTE, msg);
    }

    public static void note(CharSequence msg, Element e) {
        if (isLoggable(NOTE))
            printMessage(NOTE, msg, e);
    }

    public static void note(CharSequence msg, Element e, AnnotationMirror a) {
        if (isLoggable(NOTE))
            printMessage(NOTE, msg, e, a);
    }

    public static void note(CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        if (isLoggable(NOTE))
            printMessage(NOTE, msg, e, a, v);
    }

    public static void error(CharSequence msg) {
        if (isLoggable(ERROR))
            printMessage(ERROR, msg);
    }

    public static void error(CharSequence msg, Element e) {
        if (isLoggable(ERROR))
            printMessage(ERROR, msg, e);
    }

    public static void error(CharSequence msg, Element e, AnnotationMirror a) {
        if (isLoggable(ERROR))
            printMessage(ERROR, msg, e, a);
    }

    public static void error(CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        if (isLoggable(ERROR))
            printMessage(ERROR, msg, e, a, v);
    }


    public static void manWarn(CharSequence msg) {
        if (isLoggable(MANDATORY_WARNING))
            printMessage(MANDATORY_WARNING, msg);
    }

    public static void manWarn(CharSequence msg, Element e) {
        if (isLoggable(MANDATORY_WARNING))
            printMessage(MANDATORY_WARNING, msg, e);
    }

    public static void manWarn(CharSequence msg, Element e, AnnotationMirror a) {
        if (isLoggable(MANDATORY_WARNING))
            printMessage(MANDATORY_WARNING, msg, e, a);
    }

    public static void manWarn(CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        if (isLoggable(MANDATORY_WARNING))
            printMessage(MANDATORY_WARNING, msg, e, a, v);
    }

    public static void warning(CharSequence msg) {
        if (isLoggable(WARNING))
            printMessage(WARNING, msg);
    }

    public static void warning(CharSequence msg, Element e) {
        if (isLoggable(WARNING))
            printMessage(WARNING, msg, e);
    }

    public static void warning(CharSequence msg, Element e, AnnotationMirror a) {
        if (isLoggable(WARNING))
            printMessage(WARNING, msg, e, a);
    }

    public static void warning(CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        if (isLoggable(WARNING))
            printMessage(WARNING, msg, e, a, v);
    }

    public static void printMessage(Diagnostic.Kind kind, CharSequence msg) {
        messager.printMessage(kind, msg);
    }

    public static void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {
        messager.printMessage(kind, msg, e);
    }

    public static void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
        messager.printMessage(kind, msg, e, a);
    }

    public static void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        messager.printMessage(kind, msg, e, a, v);
    }
}
