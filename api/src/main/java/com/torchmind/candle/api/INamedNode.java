/*
 * Copyright 2015 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.torchmind.candle.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents a named node.
 * @author Johannes Donath
 */
public interface INamedNode extends INode {

        /**
         * Retrieves the node name.
         * @return The name.
         */
        @Nullable
        String name ();

        /**
         * Sets the node name.
         * @param name The name.
         * @return The node.
         */
        @Nonnull
        INamedNode name (@Nullable String name);
}