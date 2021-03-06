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

public class V1LeaseSpecBuilder extends V1LeaseSpecFluentImpl<V1LeaseSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1LeaseSpec,
        io.kubernetes.client.openapi.models.V1LeaseSpecBuilder> {
  public V1LeaseSpecBuilder() {
    this(false);
  }

  public V1LeaseSpecBuilder(Boolean validationEnabled) {
    this(new V1LeaseSpec(), validationEnabled);
  }

  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LeaseSpecBuilder(
      io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1LeaseSpec(), validationEnabled);
  }

  public V1LeaseSpecBuilder(
      io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LeaseSpec instance) {
    this(fluent, instance, false);
  }

  public V1LeaseSpecBuilder(
      io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LeaseSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAcquireTime(instance.getAcquireTime());

    fluent.withHolderIdentity(instance.getHolderIdentity());

    fluent.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    fluent.withLeaseTransitions(instance.getLeaseTransitions());

    fluent.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled;
  }

  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpec instance) {
    this(instance, false);
  }

  public V1LeaseSpecBuilder(
      io.kubernetes.client.openapi.models.V1LeaseSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAcquireTime(instance.getAcquireTime());

    this.withHolderIdentity(instance.getHolderIdentity());

    this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    this.withLeaseTransitions(instance.getLeaseTransitions());

    this.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1LeaseSpec build() {
    V1LeaseSpec buildable = new V1LeaseSpec();
    buildable.setAcquireTime(fluent.getAcquireTime());
    buildable.setHolderIdentity(fluent.getHolderIdentity());
    buildable.setLeaseDurationSeconds(fluent.getLeaseDurationSeconds());
    buildable.setLeaseTransitions(fluent.getLeaseTransitions());
    buildable.setRenewTime(fluent.getRenewTime());
    return buildable;
  }
}
