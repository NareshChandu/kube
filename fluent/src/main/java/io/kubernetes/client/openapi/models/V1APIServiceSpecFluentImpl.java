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
import java.util.List;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1APIServiceSpecFluentImpl<A extends V1APIServiceSpecFluent<A>> extends BaseFluent<A>
    implements V1APIServiceSpecFluent<A> {
  public V1APIServiceSpecFluentImpl() {}

  public V1APIServiceSpecFluentImpl(io.kubernetes.client.openapi.models.V1APIServiceSpec instance) {
    this.withCaBundle(instance.getCaBundle());

    this.withGroup(instance.getGroup());

    this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());

    this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());

    this.withService(instance.getService());

    this.withVersion(instance.getVersion());

    this.withVersionPriority(instance.getVersionPriority());
  }

  private List<Byte> caBundle;
  private String group;
  private Integer groupPriorityMinimum;
  private Boolean insecureSkipTLSVerify;
  private ApiregistrationV1ServiceReferenceBuilder service;
  private java.lang.String version;
  private java.lang.Integer versionPriority;

  public A withCaBundle(byte... caBundle) {
    if (this.caBundle != null) {
      this.caBundle.clear();
    }
    if (caBundle != null) {
      for (byte item : caBundle) {
        this.addToCaBundle(item);
      }
    }
    return (A) this;
  }

  public byte[] getCaBundle() {
    // This needs to work with primitives, so we use arrays.
    int size = caBundle != null ? caBundle.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : caBundle) {
      result[index++] = item;
    }
    return result;
  }

  public A addToCaBundle(java.lang.Integer index, java.lang.Byte item) {
    if (this.caBundle == null) {
      this.caBundle = new ArrayList<java.lang.Byte>();
    }
    this.caBundle.add(index, item);
    return (A) this;
  }

  public A setToCaBundle(java.lang.Integer index, java.lang.Byte item) {
    if (this.caBundle == null) {
      this.caBundle = new java.util.ArrayList<java.lang.Byte>();
    }
    this.caBundle.set(index, item);
    return (A) this;
  }

  public A addToCaBundle(java.lang.Byte... items) {
    if (this.caBundle == null) {
      this.caBundle = new java.util.ArrayList<java.lang.Byte>();
    }
    for (java.lang.Byte item : items) {
      this.caBundle.add(item);
    }
    return (A) this;
  }

  public A addAllToCaBundle(Collection<java.lang.Byte> items) {
    if (this.caBundle == null) {
      this.caBundle = new java.util.ArrayList<java.lang.Byte>();
    }
    for (java.lang.Byte item : items) {
      this.caBundle.add(item);
    }
    return (A) this;
  }

  public A removeFromCaBundle(java.lang.Byte... items) {
    for (java.lang.Byte item : items) {
      if (this.caBundle != null) {
        this.caBundle.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items) {
    for (java.lang.Byte item : items) {
      if (this.caBundle != null) {
        this.caBundle.remove(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasCaBundle() {
    return caBundle != null && !caBundle.isEmpty();
  }

  public java.lang.String getGroup() {
    return this.group;
  }

  public A withGroup(java.lang.String group) {
    this.group = group;
    return (A) this;
  }

  public java.lang.Boolean hasGroup() {
    return this.group != null;
  }

  public java.lang.Integer getGroupPriorityMinimum() {
    return this.groupPriorityMinimum;
  }

  public A withGroupPriorityMinimum(java.lang.Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return (A) this;
  }

  public java.lang.Boolean hasGroupPriorityMinimum() {
    return this.groupPriorityMinimum != null;
  }

  public java.lang.Boolean getInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify;
  }

  public A withInsecureSkipTLSVerify(java.lang.Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return (A) this;
  }

  public java.lang.Boolean hasInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify != null;
  }

  /**
   * This method has been deprecated, please use method buildService instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public ApiregistrationV1ServiceReference getService() {
    return this.service != null ? this.service.build() : null;
  }

  public io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference buildService() {
    return this.service != null ? this.service.build() : null;
  }

  public A withService(
      io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference service) {
    _visitables.get("service").remove(this.service);
    if (service != null) {
      this.service =
          new io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceBuilder(service);
      _visitables.get("service").add(this.service);
    }
    return (A) this;
  }

  public java.lang.Boolean hasService() {
    return this.service != null;
  }

  public V1APIServiceSpecFluent.ServiceNested<A> withNewService() {
    return new V1APIServiceSpecFluentImpl.ServiceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A>
      withNewServiceLike(
          io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference item) {
    return new V1APIServiceSpecFluentImpl.ServiceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> editService() {
    return withNewServiceLike(getService());
  }

  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A>
      editOrNewService() {
    return withNewServiceLike(
        getService() != null
            ? getService()
            : new io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A>
      editOrNewServiceLike(
          io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference item) {
    return withNewServiceLike(getService() != null ? getService() : item);
  }

  public java.lang.String getVersion() {
    return this.version;
  }

  public A withVersion(java.lang.String version) {
    this.version = version;
    return (A) this;
  }

  public java.lang.Boolean hasVersion() {
    return this.version != null;
  }

  public java.lang.Integer getVersionPriority() {
    return this.versionPriority;
  }

  public A withVersionPriority(java.lang.Integer versionPriority) {
    this.versionPriority = versionPriority;
    return (A) this;
  }

  public java.lang.Boolean hasVersionPriority() {
    return this.versionPriority != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIServiceSpecFluentImpl that = (V1APIServiceSpecFluentImpl) o;
    if (caBundle != null ? !caBundle.equals(that.caBundle) : that.caBundle != null) return false;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (groupPriorityMinimum != null
        ? !groupPriorityMinimum.equals(that.groupPriorityMinimum)
        : that.groupPriorityMinimum != null) return false;
    if (insecureSkipTLSVerify != null
        ? !insecureSkipTLSVerify.equals(that.insecureSkipTLSVerify)
        : that.insecureSkipTLSVerify != null) return false;
    if (service != null ? !service.equals(that.service) : that.service != null) return false;
    if (version != null ? !version.equals(that.version) : that.version != null) return false;
    if (versionPriority != null
        ? !versionPriority.equals(that.versionPriority)
        : that.versionPriority != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        caBundle,
        group,
        groupPriorityMinimum,
        insecureSkipTLSVerify,
        service,
        version,
        versionPriority,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (caBundle != null && !caBundle.isEmpty()) {
      sb.append("caBundle:");
      sb.append(caBundle + ",");
    }
    if (group != null) {
      sb.append("group:");
      sb.append(group + ",");
    }
    if (groupPriorityMinimum != null) {
      sb.append("groupPriorityMinimum:");
      sb.append(groupPriorityMinimum + ",");
    }
    if (insecureSkipTLSVerify != null) {
      sb.append("insecureSkipTLSVerify:");
      sb.append(insecureSkipTLSVerify + ",");
    }
    if (service != null) {
      sb.append("service:");
      sb.append(service + ",");
    }
    if (version != null) {
      sb.append("version:");
      sb.append(version + ",");
    }
    if (versionPriority != null) {
      sb.append("versionPriority:");
      sb.append(versionPriority);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withInsecureSkipTLSVerify() {
    return withInsecureSkipTLSVerify(true);
  }

  class ServiceNestedImpl<N>
      extends ApiregistrationV1ServiceReferenceFluentImpl<V1APIServiceSpecFluent.ServiceNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<N>,
          Nested<N> {
    ServiceNestedImpl(io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference item) {
      this.builder = new ApiregistrationV1ServiceReferenceBuilder(this, item);
    }

    ServiceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceBuilder builder;

    public N and() {
      return (N) V1APIServiceSpecFluentImpl.this.withService(builder.build());
    }

    public N endService() {
      return and();
    }
  }
}
