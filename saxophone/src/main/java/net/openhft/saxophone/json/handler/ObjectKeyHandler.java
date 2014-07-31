/*
 * Copyright 2014 Higher Frequency Trading
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.saxophone.json.handler;

/**
 * Triggered on JSON object key: for example, {@code `"foo"`} or {@code `""`}.
 *
 * @see net.openhft.saxophone.json.JsonParserBuilder#objectKeyHandler(ObjectKeyHandler)
 */
public interface ObjectKeyHandler extends JsonHandlerBase {
    /**
     * Handles a JSON object key: for example, {@code `"foo"`} or {@code `""`}.
     *
     * @param key the object key
     * @return {@code true} if the parsing should be continued, {@code false} if it should be
     *         stopped immediately
     * @throws Exception if an error occurred during handling
     */
    boolean onObjectKey(CharSequence key) throws Exception;
}