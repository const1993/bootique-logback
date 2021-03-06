/**
 *  Licensed to ObjectStyle LLC under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ObjectStyle LLC licenses
 *  this file to you under the Apache License, Version 2.0 (the
 *  “License”); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  “AS IS” BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.bootique.logback.sentry;

import com.google.inject.Module;
import io.bootique.BQModuleProvider;
import io.bootique.logback.LogbackModuleProvider;

import java.util.Collection;
import java.util.Collections;

/**
 * Provider for {@link LogbackSentryModule}.
 *
 * @author Ibragimov Ruslan
 * @since 0.16
 */
public class LogbackSentryModuleProvider implements BQModuleProvider {

    @Override
    public Module module() {
        return new LogbackSentryModule();
    }

    @Override
    public Collection<BQModuleProvider> dependencies() {
        return Collections.singletonList(new LogbackModuleProvider());
    }
}
