/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.registry;

import java.util.List;

/**
 * Represents a single instance of a registry mpack version
 */
public interface RegistryMpackVersion {
  /**
   * Get mpack version
   * @return
   */
  public String getMpackVersion();

  /**
   * Get mpack build number
   * @return
   */
  public String getMpackBuildNumber();

  /**
   * Get mpack url
   * @return
   */
  public String getMpackUrl();

  /**
   * Get mpack doc url
   * @return
   */
  public String getMpackDocUrl();


  /**
   * Get mpack stack id
   * @return
   */
  public String getMpackStackId();

  /**
   * Get list of services in the mpack version
   * @return
   */
  public List<? extends RegistryMpackService> getMpackServices();

  /**
   * Get list of compatible mpacks
   * @return
   */
  public List<? extends RegistryMpackCompatiblity> getCompatibleMpacks();
}