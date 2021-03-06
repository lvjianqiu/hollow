/*
 *  Copyright 2016-2019 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.hollow.core.write.objectmapper;

import java.util.List;

/**
 * Sample type that represents a direct circular reference between 2 classes, with a List containing the child.
 */
@SuppressWarnings("unused")
public class DirectListCircularReference {

    private final String name;
    private final List<DirectListCircularReference> children;

    public DirectListCircularReference(String name, List<DirectListCircularReference> children) {
        this.name = name;
        this.children = children;
    }
}
