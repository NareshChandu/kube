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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1PodTemplateSpecFluentImpl<A extends V1PodTemplateSpecFluent<A>> extends BaseFluent<A>
    implements V1PodTemplateSpecFluent<A> {
  public V1PodTemplateSpecFluentImpl() {}

  public V1PodTemplateSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1PodTemplateSpec instance) {
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());
  }

  private V1ObjectMetaBuilder metadata;
  private V1PodSpecBuilder spec;

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1PodTemplateSpecFluent.MetadataNested<A> withNewMetadata() {
    return new V1PodTemplateSpecFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1PodTemplateSpecFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1PodSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new io.kubernetes.client.openapi.models.V1PodSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public V1PodTemplateSpecFluent.SpecNested<A> withNewSpec() {
    return new V1PodTemplateSpecFluentImpl.SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1PodSpec item) {
    return new io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl.SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1PodSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.SpecNested<A>
      editOrNewSpecLike(io.kubernetes.client.openapi.models.V1PodSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodTemplateSpecFluentImpl that = (V1PodTemplateSpecFluentImpl) o;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(metadata, spec, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (spec != null) {
      sb.append("spec:");
      sb.append(spec);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1PodTemplateSpecFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1PodTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N> extends V1PodSpecFluentImpl<V1PodTemplateSpecFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent.SpecNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(V1PodSpec item) {
      this.builder = new V1PodSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodSpecBuilder builder;

    public N and() {
      return (N) V1PodTemplateSpecFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }
}
