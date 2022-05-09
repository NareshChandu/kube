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
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1StorageClassFluent<A extends V1StorageClassFluent<A>> extends Fluent<A> {
  public Boolean getAllowVolumeExpansion();

  public A withAllowVolumeExpansion(java.lang.Boolean allowVolumeExpansion);

  public java.lang.Boolean hasAllowVolumeExpansion();

  public A addToAllowedTopologies(Integer index, V1TopologySelectorTerm item);

  public A setToAllowedTopologies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySelectorTerm item);

  public A addToAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items);

  public A addAllToAllowedTopologies(
      Collection<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> items);

  public A removeFromAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items);

  public A removeAllFromAllowedTopologies(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> items);

  public A removeMatchingFromAllowedTopologies(Predicate<V1TopologySelectorTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildAllowedTopologies instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> getAllowedTopologies();

  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm>
      buildAllowedTopologies();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildAllowedTopology(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildFirstAllowedTopology();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildLastAllowedTopology();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildMatchingAllowedTopology(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
          predicate);

  public java.lang.Boolean hasMatchingAllowedTopology(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
          predicate);

  public A withAllowedTopologies(
      java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> allowedTopologies);

  public A withAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... allowedTopologies);

  public java.lang.Boolean hasAllowedTopologies();

  public V1StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopology();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      addNewAllowedTopologyLike(io.kubernetes.client.openapi.models.V1TopologySelectorTerm item);

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      setNewAllowedTopologyLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySelectorTerm item);

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editAllowedTopology(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editFirstAllowedTopology();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editLastAllowedTopology();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editMatchingAllowedTopology(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
              predicate);

  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1StorageClassFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToMountOptions(java.lang.Integer index, java.lang.String item);

  public A setToMountOptions(java.lang.Integer index, java.lang.String item);

  public A addToMountOptions(java.lang.String... items);

  public A addAllToMountOptions(java.util.Collection<java.lang.String> items);

  public A removeFromMountOptions(java.lang.String... items);

  public A removeAllFromMountOptions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getMountOptions();

  public java.lang.String getMountOption(java.lang.Integer index);

  public java.lang.String getFirstMountOption();

  public java.lang.String getLastMountOption();

  public java.lang.String getMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withMountOptions(java.util.List<java.lang.String> mountOptions);

  public A withMountOptions(java.lang.String... mountOptions);

  public java.lang.Boolean hasMountOptions();

  public A addToParameters(java.lang.String key, java.lang.String value);

  public A addToParameters(Map<java.lang.String, java.lang.String> map);

  public A removeFromParameters(java.lang.String key);

  public A removeFromParameters(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getParameters();

  public <K, V> A withParameters(java.util.Map<java.lang.String, java.lang.String> parameters);

  public java.lang.Boolean hasParameters();

  public java.lang.String getProvisioner();

  public A withProvisioner(java.lang.String provisioner);

  public java.lang.Boolean hasProvisioner();

  public java.lang.String getReclaimPolicy();

  public A withReclaimPolicy(java.lang.String reclaimPolicy);

  public java.lang.Boolean hasReclaimPolicy();

  public java.lang.String getVolumeBindingMode();

  public A withVolumeBindingMode(java.lang.String volumeBindingMode);

  public java.lang.Boolean hasVolumeBindingMode();

  public A withAllowVolumeExpansion();

  public interface AllowedTopologiesNested<N>
      extends Nested<N>,
          V1TopologySelectorTermFluent<V1StorageClassFluent.AllowedTopologiesNested<N>> {
    public N and();

    public N endAllowedTopology();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectMetaFluent<V1StorageClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
