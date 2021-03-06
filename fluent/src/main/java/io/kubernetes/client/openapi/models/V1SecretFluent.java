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
import java.util.Map;

/** Generated */
public interface V1SecretFluent<A extends V1SecretFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToData(java.lang.String key, byte[] value);

  public A addToData(Map<java.lang.String, byte[]> map);

  public A removeFromData(java.lang.String key);

  public A removeFromData(java.util.Map<java.lang.String, byte[]> map);

  public java.util.Map<java.lang.String, byte[]> getData();

  public <K, V> A withData(java.util.Map<java.lang.String, byte[]> data);

  public java.lang.Boolean hasData();

  public java.lang.Boolean getImmutable();

  public A withImmutable(java.lang.Boolean immutable);

  public java.lang.Boolean hasImmutable();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1SecretFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1SecretFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1SecretFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1SecretFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1SecretFluent.MetadataNested<A> editOrNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToStringData(java.lang.String key, java.lang.String value);

  public A addToStringData(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromStringData(java.lang.String key);

  public A removeFromStringData(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getStringData();

  public <K, V> A withStringData(java.util.Map<java.lang.String, java.lang.String> stringData);

  public java.lang.Boolean hasStringData();

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public A withImmutable();

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1SecretFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
