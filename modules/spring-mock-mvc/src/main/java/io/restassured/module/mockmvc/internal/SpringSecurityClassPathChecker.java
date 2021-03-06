/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.restassured.module.mockmvc.internal;

/**
 * Checks whether or not the spring-security module is in classpath
 */
class SpringSecurityClassPathChecker {
    private static final String SECURITY_CONTEXT_HOLDER_CLASS_NAME = "org.springframework.security.core.context.SecurityContextHolder";

    public static boolean isSpringSecurityInClasspath() {
        try {
            Class.forName(SECURITY_CONTEXT_HOLDER_CLASS_NAME, false, Thread.currentThread().getContextClassLoader());
            return true;
        } catch (Throwable e) {
            return false;
        }
    }

}
