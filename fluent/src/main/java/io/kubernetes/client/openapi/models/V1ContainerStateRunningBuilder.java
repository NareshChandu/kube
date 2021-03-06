/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1ContainerStateRunningBuilder
    extends V1ContainerStateRunningFluentImpl<V1ContainerStateRunningBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ContainerStateRunning,
        io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder> {
  public V1ContainerStateRunningBuilder() {
    this(false);
  }

  public V1ContainerStateRunningBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateRunning(), validationEnabled);
  }

  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerStateRunningBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ContainerStateRunning(), validationEnabled);
  }

  public V1ContainerStateRunningBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerStateRunning instance) {
    this(fluent, instance, false);
  }

  public V1ContainerStateRunningBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerStateRunning instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerStateRunningBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStateRunning instance) {
    this(instance, false);
  }

  public V1ContainerStateRunningBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStateRunning instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ContainerStateRunning build() {
    V1ContainerStateRunning buildable = new V1ContainerStateRunning();
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
}
