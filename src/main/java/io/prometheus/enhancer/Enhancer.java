package io.prometheus.enhancer;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import java.io.IOException;

/**
 * Author santhosh.ct .
 */
public interface Enhancer {

    /**
     *
     * @param ctClass
     * @return
     * @throws CannotCompileException
     * @throws NotFoundException
     * @throws IOException
     */
    boolean enhance(ClassPool cp, CtClass ctClass) throws CannotCompileException, NotFoundException, IOException;
}
