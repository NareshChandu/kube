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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V2beta2HorizontalPodAutoscalerSpecFluent<
        A extends V2beta2HorizontalPodAutoscalerSpecFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildBehavior instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HorizontalPodAutoscalerBehavior getBehavior();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior buildBehavior();

  public A withBehavior(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior behavior);

  public Boolean hasBehavior();

  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      withNewBehaviorLike(
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editBehavior();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editOrNewBehavior();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editOrNewBehaviorLike(
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item);

  public Integer getMaxReplicas();

  public A withMaxReplicas(java.lang.Integer maxReplicas);

  public java.lang.Boolean hasMaxReplicas();

  public A addToMetrics(java.lang.Integer index, V2beta2MetricSpec item);

  public A setToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item);

  public A addToMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);

  public A addAllToMetrics(Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items);

  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);

  public A removeAllFromMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items);

  public A removeMatchingFromMetrics(Predicate<V2beta2MetricSpecBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildMetrics instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> getMetrics();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> buildMetrics();

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildFirstMetric();

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildLastMetric();

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
          predicate);

  public java.lang.Boolean hasMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
          predicate);

  public A withMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> metrics);

  public A withMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... metrics);

  public java.lang.Boolean hasMetrics();

  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricSpec item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      setNewMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editFirstMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editLastMetric();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMatchingMetric(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
              predicate);

  public java.lang.Integer getMinReplicas();

  public A withMinReplicas(java.lang.Integer minReplicas);

  public java.lang.Boolean hasMinReplicas();

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2CrossVersionObjectReference getScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference
      buildScaleTargetRef();

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference scaleTargetRef);

  public java.lang.Boolean hasScaleTargetRef();

  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);

  public interface BehaviorNested<N>
      extends Nested<N>,
          V2beta2HorizontalPodAutoscalerBehaviorFluent<
              V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>> {
    public N and();

    public N endBehavior();
  }

  public interface MetricsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2MetricSpecFluent<V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>> {
    public N and();

    public N endMetric();
  }

  public interface ScaleTargetRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2CrossVersionObjectReferenceFluent<
              V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> {
    public N and();

    public N endScaleTargetRef();
  }
}
