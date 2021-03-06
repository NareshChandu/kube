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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1HostPortRangeFluentImpl<A extends V1beta1HostPortRangeFluent<A>>
    extends BaseFluent<A> implements V1beta1HostPortRangeFluent<A> {
  public V1beta1HostPortRangeFluentImpl() {}

  public V1beta1HostPortRangeFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1HostPortRange instance) {
    this.withMax(instance.getMax());

    this.withMin(instance.getMin());
  }

  private Integer max;
  private java.lang.Integer min;

  public java.lang.Integer getMax() {
    return this.max;
  }

  public A withMax(java.lang.Integer max) {
    this.max = max;
    return (A) this;
  }

  public Boolean hasMax() {
    return this.max != null;
  }

  public java.lang.Integer getMin() {
    return this.min;
  }

  public A withMin(java.lang.Integer min) {
    this.min = min;
    return (A) this;
  }

  public java.lang.Boolean hasMin() {
    return this.min != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1HostPortRangeFluentImpl that = (V1beta1HostPortRangeFluentImpl) o;
    if (max != null ? !max.equals(that.max) : that.max != null) return false;
    if (min != null ? !min.equals(that.min) : that.min != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(max, min, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (max != null) {
      sb.append("max:");
      sb.append(max + ",");
    }
    if (min != null) {
      sb.append("min:");
      sb.append(min);
    }
    sb.append("}");
    return sb.toString();
  }
}
