/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ambari.infra.job.archive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class DocumentExportStepListener implements StepExecutionListener {
  private static final Logger LOG = LoggerFactory.getLogger(DocumentExportStepListener.class);

  private final DocumentExportProperties properties;

  public DocumentExportStepListener(DocumentExportProperties properties) {
    this.properties = properties;
  }

  @Override
  public void beforeStep(StepExecution stepExecution) {
    properties.apply(stepExecution.getJobParameters());
    LOG.info("LogExport step - before step execution");
  }

  @Override
  public ExitStatus afterStep(StepExecution stepExecution) {
    LOG.info("LogExport step - after step execution");
    return stepExecution.getExitStatus();
  }
}