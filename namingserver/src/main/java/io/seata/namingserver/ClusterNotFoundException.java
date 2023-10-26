/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.namingserver;

public class ClusterNotFoundException extends RuntimeException {

    /**
     * cluster not found exception.
     *
     * @param message the message
     */
    public ClusterNotFoundException(String message) {
        super(message);
    }

    /**
     * cluster not found exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public ClusterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * cluster not found exception.
     *
     * @param cause the cause
     */
    public ClusterNotFoundException(Throwable cause) {
        super(cause);
    }

}
