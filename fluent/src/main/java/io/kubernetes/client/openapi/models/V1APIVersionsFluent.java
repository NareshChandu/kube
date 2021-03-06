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
public interface V1APIVersionsFluent<A extends V1APIVersionsFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  public A addToServerAddressByClientCIDRs(Integer index, V1ServerAddressByClientCIDR item);

  public A setToServerAddressByClientCIDRs(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public A addToServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);

  public A addAllToServerAddressByClientCIDRs(
      Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);

  public A removeFromServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);

  public A removeAllFromServerAddressByClientCIDRs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);

  public A removeMatchingFromServerAddressByClientCIDRs(
      Predicate<V1ServerAddressByClientCIDRBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      getServerAddressByClientCIDRs();

  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      buildServerAddressByClientCIDRs();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildServerAddressByClientCIDR(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildFirstServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildLastServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate);

  public java.lang.Boolean hasMatchingServerAddressByClientCIDR(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
          predicate);

  public A withServerAddressByClientCIDRs(
      java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
          serverAddressByClientCIDRs);

  public A withServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR...
          serverAddressByClientCIDRs);

  public java.lang.Boolean hasServerAddressByClientCIDRs();

  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDRLike(
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      setNewServerAddressByClientCIDRLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editServerAddressByClientCIDR(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editFirstServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editLastServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate);

  public A addToVersions(java.lang.Integer index, java.lang.String item);

  public A setToVersions(java.lang.Integer index, java.lang.String item);

  public A addToVersions(java.lang.String... items);

  public A addAllToVersions(java.util.Collection<java.lang.String> items);

  public A removeFromVersions(java.lang.String... items);

  public A removeAllFromVersions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getVersions();

  public java.lang.String getVersion(java.lang.Integer index);

  public java.lang.String getFirstVersion();

  public java.lang.String getLastVersion();

  public java.lang.String getMatchingVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withVersions(java.util.List<java.lang.String> versions);

  public A withVersions(java.lang.String... versions);

  public java.lang.Boolean hasVersions();

  public interface ServerAddressByClientCIDRsNested<N>
      extends Nested<N>,
          V1ServerAddressByClientCIDRFluent<
              V1APIVersionsFluent.ServerAddressByClientCIDRsNested<N>> {
    public N and();

    public N endServerAddressByClientCIDR();
  }
}
