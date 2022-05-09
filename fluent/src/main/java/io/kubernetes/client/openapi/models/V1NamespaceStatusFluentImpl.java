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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1NamespaceStatusFluentImpl<A extends V1NamespaceStatusFluent<A>> extends BaseFluent<A>
    implements V1NamespaceStatusFluent<A> {
  public V1NamespaceStatusFluentImpl() {}

  public V1NamespaceStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1NamespaceStatus instance) {
    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());
  }

  private ArrayList<V1NamespaceConditionBuilder> conditions;
  private String phase;

  public A addToConditions(Integer index, V1NamespaceCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NamespaceCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) {
      _visitables.get("conditions").add(builder);
    } else {
      _visitables.get("conditions").set(index, builder);
    }
    if (index < 0 || index >= conditions.size()) {
      conditions.add(builder);
    } else {
      conditions.set(index, builder);
    }
    return (A) this;
  }

  public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : items) {
      io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : items) {
      io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items) {
    for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : items) {
      io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items) {
    for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : items) {
      io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1NamespaceCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition>
      buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1NamespaceCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1NamespaceStatusFluentImpl.ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1NamespaceCondition item) {
    return new V1NamespaceStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NamespaceCondition item) {
    return new io.kubernetes.client.openapi.models.V1NamespaceStatusFluentImpl.ConditionsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < conditions.size(); i++) {
      if (predicate.test(conditions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public java.lang.String getPhase() {
    return this.phase;
  }

  public A withPhase(java.lang.String phase) {
    this.phase = phase;
    return (A) this;
  }

  public java.lang.Boolean hasPhase() {
    return this.phase != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NamespaceStatusFluentImpl that = (V1NamespaceStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (phase != null ? !phase.equals(that.phase) : that.phase != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(conditions, phase, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) {
      sb.append("conditions:");
      sb.append(conditions + ",");
    }
    if (phase != null) {
      sb.append("phase:");
      sb.append(phase);
    }
    sb.append("}");
    return sb.toString();
  }

  class ConditionsNestedImpl<N>
      extends V1NamespaceConditionFluentImpl<V1NamespaceStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<N>,
          Nested<N> {
    ConditionsNestedImpl(java.lang.Integer index, V1NamespaceCondition item) {
      this.index = index;
      this.builder = new V1NamespaceConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NamespaceStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
