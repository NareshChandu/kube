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

/** Generated */
public interface V1ScaleIOPersistentVolumeSourceFluent<
        A extends V1ScaleIOPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getFsType();

  public A withFsType(java.lang.String fsType);

  public Boolean hasFsType();

  public java.lang.String getGateway();

  public A withGateway(java.lang.String gateway);

  public java.lang.Boolean hasGateway();

  public java.lang.String getProtectionDomain();

  public A withProtectionDomain(java.lang.String protectionDomain);

  public java.lang.Boolean hasProtectionDomain();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);

  public java.lang.Boolean hasSecretRef();

  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public java.lang.Boolean getSslEnabled();

  public A withSslEnabled(java.lang.Boolean sslEnabled);

  public java.lang.Boolean hasSslEnabled();

  public java.lang.String getStorageMode();

  public A withStorageMode(java.lang.String storageMode);

  public java.lang.Boolean hasStorageMode();

  public java.lang.String getStoragePool();

  public A withStoragePool(java.lang.String storagePool);

  public java.lang.Boolean hasStoragePool();

  public java.lang.String getSystem();

  public A withSystem(java.lang.String system);

  public java.lang.Boolean hasSystem();

  public java.lang.String getVolumeName();

  public A withVolumeName(java.lang.String volumeName);

  public java.lang.Boolean hasVolumeName();

  public A withReadOnly();

  public A withSslEnabled();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
