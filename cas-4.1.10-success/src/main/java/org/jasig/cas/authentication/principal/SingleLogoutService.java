/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package cas.authentication.principal;

/**
 * Define a service which support single logout.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public interface SingleLogoutService extends WebApplicationService {

    /**
     * Return if the service is already logged out.
     *
     * @return if the service is already logged out.
     */
    boolean isLoggedOutAlready();

    /**
     * Set if the service is already logged out.
     *
     * @param loggedOutAlready if the service is already logged out.
     */
    void setLoggedOutAlready(boolean loggedOutAlready);
}
