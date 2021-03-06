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
public interface V2beta2HorizontalPodAutoscalerStatusFluent<
        A extends V2beta2HorizontalPodAutoscalerStatusFluent<A>>
    extends Fluent<A> {
  public A addToConditions(Integer index, V2beta2HorizontalPodAutoscalerCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... items);

  public A addAllToConditions(
      Collection<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<
              io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition>
          items);

  public A removeMatchingFromConditions(
      Predicate<V2beta2HorizontalPodAutoscalerConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition
      buildFirstCondition();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition
      buildLastCondition();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V2beta2HorizontalPodAutoscalerConditionBuilder>
              predicate);

  public Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... conditions);

  public java.lang.Boolean hasConditions();

  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V2beta2HorizontalPodAutoscalerConditionBuilder>
              predicate);

  public A addToCurrentMetrics(java.lang.Integer index, V2beta2MetricStatus item);

  public A setToCurrentMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricStatus item);

  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2beta2MetricStatus... items);

  public A addAllToCurrentMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricStatus> items);

  public A removeFromCurrentMetrics(
      io.kubernetes.client.openapi.models.V2beta2MetricStatus... items);

  public A removeAllFromCurrentMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricStatus> items);

  public A removeMatchingFromCurrentMetrics(
      java.util.function.Predicate<V2beta2MetricStatusBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricStatus>
      getCurrentMetrics();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricStatus>
      buildCurrentMetrics();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatus buildCurrentMetric(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatus buildFirstCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatus buildLastCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatus buildMatchingCurrentMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricStatusBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCurrentMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricStatusBuilder>
          predicate);

  public A withCurrentMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricStatus> currentMetrics);

  public A withCurrentMetrics(
      io.kubernetes.client.openapi.models.V2beta2MetricStatus... currentMetrics);

  public java.lang.Boolean hasCurrentMetrics();

  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      addNewCurrentMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      setNewCurrentMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editCurrentMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editFirstCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editLastCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editMatchingCurrentMetric(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V2beta2MetricStatusBuilder>
              predicate);

  public java.lang.Integer getCurrentReplicas();

  public A withCurrentReplicas(java.lang.Integer currentReplicas);

  public java.lang.Boolean hasCurrentReplicas();

  public java.lang.Integer getDesiredReplicas();

  public A withDesiredReplicas(java.lang.Integer desiredReplicas);

  public java.lang.Boolean hasDesiredReplicas();

  public OffsetDateTime getLastScaleTime();

  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime);

  public java.lang.Boolean hasLastScaleTime();

  public Long getObservedGeneration();

  public A withObservedGeneration(java.lang.Long observedGeneration);

  public java.lang.Boolean hasObservedGeneration();

  public interface ConditionsNested<N>
      extends Nested<N>,
          V2beta2HorizontalPodAutoscalerConditionFluent<
              V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface CurrentMetricsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2MetricStatusFluent<
              V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>> {
    public N and();

    public N endCurrentMetric();
  }
}
