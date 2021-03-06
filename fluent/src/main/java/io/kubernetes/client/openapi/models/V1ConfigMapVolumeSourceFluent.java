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
public interface V1ConfigMapVolumeSourceFluent<A extends V1ConfigMapVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Integer getDefaultMode();

  public A withDefaultMode(java.lang.Integer defaultMode);

  public Boolean hasDefaultMode();

  public A addToItems(java.lang.Integer index, V1KeyToPath item);

  public A setToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item);

  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items);

  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1KeyToPath> getItems();

  public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> buildItems();

  public io.kubernetes.client.openapi.models.V1KeyToPath buildItem(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1KeyToPath buildFirstItem();

  public io.kubernetes.client.openapi.models.V1KeyToPath buildLastItem();

  public io.kubernetes.client.openapi.models.V1KeyToPath buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
          predicate);

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
          predicate);

  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> items);

  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public java.lang.Boolean hasItems();

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> addNewItem();

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A>
      addNewItemLike(io.kubernetes.client.openapi.models.V1KeyToPath item);

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A>
      setNewItemLike(java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item);

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> editItem(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A>
      editFirstItem();

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A>
      editLastItem();

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A>
      editMatchingItem(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
              predicate);

  public String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  public java.lang.Boolean getOptional();

  public A withOptional(java.lang.Boolean optional);

  public java.lang.Boolean hasOptional();

  public A withOptional();

  public interface ItemsNested<N>
      extends Nested<N>, V1KeyToPathFluent<V1ConfigMapVolumeSourceFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }
}
