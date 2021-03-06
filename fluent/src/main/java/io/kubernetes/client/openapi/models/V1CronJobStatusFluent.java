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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1CronJobStatusFluent<A extends V1CronJobStatusFluent<A>> extends Fluent<A> {
  public A addToActive(Integer index, V1ObjectReference item);

  public A setToActive(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item);

  public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);

  public A addAllToActive(Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);

  public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);

  public A removeAllFromActive(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);

  public A removeMatchingFromActive(Predicate<V1ObjectReferenceBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildActive instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ObjectReference> getActive();

  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildActive();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildActive(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstActive();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildLastActive();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingActive(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate);

  public Boolean hasMatchingActive(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate);

  public A withActive(java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> active);

  public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active);

  public java.lang.Boolean hasActive();

  public V1CronJobStatusFluent.ActiveNested<A> addNewActive();

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> editActive(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A>
      editFirstActive();

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> editLastActive();

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A>
      editMatchingActive(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
              predicate);

  public OffsetDateTime getLastScheduleTime();

  public A withLastScheduleTime(java.time.OffsetDateTime lastScheduleTime);

  public java.lang.Boolean hasLastScheduleTime();

  public java.time.OffsetDateTime getLastSuccessfulTime();

  public A withLastSuccessfulTime(java.time.OffsetDateTime lastSuccessfulTime);

  public java.lang.Boolean hasLastSuccessfulTime();

  public interface ActiveNested<N>
      extends Nested<N>, V1ObjectReferenceFluent<V1CronJobStatusFluent.ActiveNested<N>> {
    public N and();

    public N endActive();
  }
}
