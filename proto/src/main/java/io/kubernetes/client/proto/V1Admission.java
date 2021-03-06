/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.proto;

public final class V1Admission {
  private V1Admission() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface AdmissionRequestOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1.AdmissionRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    boolean hasUid();
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    java.lang.String getUid();
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    com.google.protobuf.ByteString getUidBytes();

    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKind getKind();
    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder();

    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResource getResource();
    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    boolean hasSubResource();
    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    java.lang.String getSubResource();
    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    com.google.protobuf.ByteString getSubResourceBytes();

    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    boolean hasRequestKind();
    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKind getRequestKind();
    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getRequestKindOrBuilder();

    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    boolean hasRequestResource();
    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResource getRequestResource();
    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getRequestResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    boolean hasRequestSubResource();
    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    java.lang.String getRequestSubResource();
    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    com.google.protobuf.ByteString getRequestSubResourceBytes();

    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();

    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    boolean hasOperation();
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    java.lang.String getOperation();
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    com.google.protobuf.ByteString getOperationBytes();

    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    boolean hasUserInfo();
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo();
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder();

    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtension getObject();
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    boolean hasOldObject();
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtension getOldObject();
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * DryRun indicates that modifications will definitely not be persisted for this request.
     * Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool dryRun = 11;</code>
     */
    boolean hasDryRun();
    /**
     *
     *
     * <pre>
     * DryRun indicates that modifications will definitely not be persisted for this request.
     * Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool dryRun = 11;</code>
     */
    boolean getDryRun();

    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    boolean hasOptions();
    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtension getOptions();
    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOptionsOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * AdmissionRequest describes the admission.Attributes for the admission request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1.AdmissionRequest}
   */
  public static final class AdmissionRequest extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1.AdmissionRequest)
      AdmissionRequestOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionRequest.newBuilder() to construct.
    private AdmissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionRequest() {
      uid_ = "";
      subResource_ = "";
      requestSubResource_ = "";
      name_ = "";
      namespace_ = "";
      operation_ = "";
      dryRun_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                uid_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.GroupVersionKind.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = kind_.toBuilder();
                }
                kind_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionKind.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(kind_);
                  kind_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.GroupVersionResource.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionResource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                subResource_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000080;
                name_ = bs;
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000100;
                namespace_ = bs;
                break;
              }
            case 58:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000200;
                operation_ = bs;
                break;
              }
            case 66:
              {
                io.kubernetes.client.proto.V1Authentication.UserInfo.Builder subBuilder = null;
                if (((bitField0_ & 0x00000400) == 0x00000400)) {
                  subBuilder = userInfo_.toBuilder();
                }
                userInfo_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Authentication.UserInfo.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(userInfo_);
                  userInfo_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000400;
                break;
              }
            case 74:
              {
                io.kubernetes.client.proto.Runtime.RawExtension.Builder subBuilder = null;
                if (((bitField0_ & 0x00000800) == 0x00000800)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.RawExtension.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000800;
                break;
              }
            case 82:
              {
                io.kubernetes.client.proto.Runtime.RawExtension.Builder subBuilder = null;
                if (((bitField0_ & 0x00001000) == 0x00001000)) {
                  subBuilder = oldObject_.toBuilder();
                }
                oldObject_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.RawExtension.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(oldObject_);
                  oldObject_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00001000;
                break;
              }
            case 88:
              {
                bitField0_ |= 0x00002000;
                dryRun_ = input.readBool();
                break;
              }
            case 98:
              {
                io.kubernetes.client.proto.Runtime.RawExtension.Builder subBuilder = null;
                if (((bitField0_ & 0x00004000) == 0x00004000)) {
                  subBuilder = options_.toBuilder();
                }
                options_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.RawExtension.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(options_);
                  options_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00004000;
                break;
              }
            case 106:
              {
                io.kubernetes.client.proto.Meta.GroupVersionKind.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = requestKind_.toBuilder();
                }
                requestKind_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionKind.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(requestKind_);
                  requestKind_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            case 114:
              {
                io.kubernetes.client.proto.Meta.GroupVersionResource.Builder subBuilder = null;
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                  subBuilder = requestResource_.toBuilder();
                }
                requestResource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.GroupVersionResource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(requestResource_);
                  requestResource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000020;
                break;
              }
            case 122:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000040;
                requestSubResource_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Admission.AdmissionRequest.class,
              io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private volatile java.lang.Object uid_;
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
     * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
     * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
     * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KIND_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.GroupVersionKind kind_;
    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKind getKind() {
      return kind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : kind_;
    }
    /**
     *
     *
     * <pre>
     * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder() {
      return kind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : kind_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.GroupVersionResource resource_;
    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResource getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * Resource is the fully-qualified resource being requested (for example, v1.pods)
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : resource_;
    }

    public static final int SUBRESOURCE_FIELD_NUMBER = 4;
    private volatile java.lang.Object subResource_;
    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    public boolean hasSubResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    public java.lang.String getSubResource() {
      java.lang.Object ref = subResource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subResource_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * SubResource is the subresource being requested, if any (for example, "status" or "scale")
     * +optional
     * </pre>
     *
     * <code>optional string subResource = 4;</code>
     */
    public com.google.protobuf.ByteString getSubResourceBytes() {
      java.lang.Object ref = subResource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REQUESTKIND_FIELD_NUMBER = 13;
    private io.kubernetes.client.proto.Meta.GroupVersionKind requestKind_;
    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    public boolean hasRequestKind() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKind getRequestKind() {
      return requestKind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : requestKind_;
    }
    /**
     *
     *
     * <pre>
     * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
     * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
     * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getRequestKindOrBuilder() {
      return requestKind_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
          : requestKind_;
    }

    public static final int REQUESTRESOURCE_FIELD_NUMBER = 14;
    private io.kubernetes.client.proto.Meta.GroupVersionResource requestResource_;
    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    public boolean hasRequestResource() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResource getRequestResource() {
      return requestResource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : requestResource_;
    }
    /**
     *
     *
     * <pre>
     * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
     * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
     * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
     * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
     * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
     * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
     * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder
        getRequestResourceOrBuilder() {
      return requestResource_ == null
          ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
          : requestResource_;
    }

    public static final int REQUESTSUBRESOURCE_FIELD_NUMBER = 15;
    private volatile java.lang.Object requestSubResource_;
    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    public boolean hasRequestSubResource() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    public java.lang.String getRequestSubResource() {
      java.lang.Object ref = requestSubResource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          requestSubResource_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
     * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
     * See documentation for the "matchPolicy" field in the webhook configuration type.
     * +optional
     * </pre>
     *
     * <code>optional string requestSubResource = 15;</code>
     */
    public com.google.protobuf.ByteString getRequestSubResourceBytes() {
      java.lang.Object ref = requestSubResource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestSubResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
     * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
     * +optional
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAMESPACE_FIELD_NUMBER = 6;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namespace_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace associated with the request (if any).
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 6;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OPERATION_FIELD_NUMBER = 7;
    private volatile java.lang.Object operation_;
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    public boolean hasOperation() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    public java.lang.String getOperation() {
      java.lang.Object ref = operation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          operation_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Operation is the operation being performed. This may be different than the operation
     * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
     * </pre>
     *
     * <code>optional string operation = 7;</code>
     */
    public com.google.protobuf.ByteString getOperationBytes() {
      java.lang.Object ref = operation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERINFO_FIELD_NUMBER = 8;
    private io.kubernetes.client.proto.V1Authentication.UserInfo userInfo_;
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    public boolean hasUserInfo() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    public io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo() {
      return userInfo_ == null
          ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
          : userInfo_;
    }
    /**
     *
     *
     * <pre>
     * UserInfo is information about the requesting user
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
     */
    public io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder() {
      return userInfo_ == null
          ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
          : userInfo_;
    }

    public static final int OBJECT_FIELD_NUMBER = 9;
    private io.kubernetes.client.proto.Runtime.RawExtension object_;
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtension getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * Object is the object from the incoming request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : object_;
    }

    public static final int OLDOBJECT_FIELD_NUMBER = 10;
    private io.kubernetes.client.proto.Runtime.RawExtension oldObject_;
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    public boolean hasOldObject() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtension getOldObject() {
      return oldObject_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : oldObject_;
    }
    /**
     *
     *
     * <pre>
     * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder() {
      return oldObject_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : oldObject_;
    }

    public static final int DRYRUN_FIELD_NUMBER = 11;
    private boolean dryRun_;
    /**
     *
     *
     * <pre>
     * DryRun indicates that modifications will definitely not be persisted for this request.
     * Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool dryRun = 11;</code>
     */
    public boolean hasDryRun() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    /**
     *
     *
     * <pre>
     * DryRun indicates that modifications will definitely not be persisted for this request.
     * Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool dryRun = 11;</code>
     */
    public boolean getDryRun() {
      return dryRun_;
    }

    public static final int OPTIONS_FIELD_NUMBER = 12;
    private io.kubernetes.client.proto.Runtime.RawExtension options_;
    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    public boolean hasOptions() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtension getOptions() {
      return options_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : options_;
    }
    /**
     *
     *
     * <pre>
     * Options is the operation option structure of the operation being performed.
     * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
     * different than the options the caller provided. e.g. for a patch request the performed
     * Operation might be a CREATE, in which case the Options will a
     * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
     */
    public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOptionsOrBuilder() {
      return options_ == null
          ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
          : options_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getKind());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getResource());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subResource_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, namespace_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, operation_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeMessage(8, getUserInfo());
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeMessage(9, getObject());
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeMessage(10, getOldObject());
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        output.writeBool(11, dryRun_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeMessage(12, getOptions());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(13, getRequestKind());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(14, getRequestResource());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, requestSubResource_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKind());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getResource());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subResource_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, namespace_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, operation_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getUserInfo());
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(9, getObject());
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, getOldObject());
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, dryRun_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, getOptions());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(13, getRequestKind());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(14, getRequestResource());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, requestSubResource_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Admission.AdmissionRequest)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Admission.AdmissionRequest other =
          (io.kubernetes.client.proto.V1Admission.AdmissionRequest) obj;

      boolean result = true;
      result = result && (hasUid() == other.hasUid());
      if (hasUid()) {
        result = result && getUid().equals(other.getUid());
      }
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasSubResource() == other.hasSubResource());
      if (hasSubResource()) {
        result = result && getSubResource().equals(other.getSubResource());
      }
      result = result && (hasRequestKind() == other.hasRequestKind());
      if (hasRequestKind()) {
        result = result && getRequestKind().equals(other.getRequestKind());
      }
      result = result && (hasRequestResource() == other.hasRequestResource());
      if (hasRequestResource()) {
        result = result && getRequestResource().equals(other.getRequestResource());
      }
      result = result && (hasRequestSubResource() == other.hasRequestSubResource());
      if (hasRequestSubResource()) {
        result = result && getRequestSubResource().equals(other.getRequestSubResource());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && (hasOperation() == other.hasOperation());
      if (hasOperation()) {
        result = result && getOperation().equals(other.getOperation());
      }
      result = result && (hasUserInfo() == other.hasUserInfo());
      if (hasUserInfo()) {
        result = result && getUserInfo().equals(other.getUserInfo());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasOldObject() == other.hasOldObject());
      if (hasOldObject()) {
        result = result && getOldObject().equals(other.getOldObject());
      }
      result = result && (hasDryRun() == other.hasDryRun());
      if (hasDryRun()) {
        result = result && (getDryRun() == other.getDryRun());
      }
      result = result && (hasOptions() == other.hasOptions());
      if (hasOptions()) {
        result = result && getOptions().equals(other.getOptions());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasSubResource()) {
        hash = (37 * hash) + SUBRESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSubResource().hashCode();
      }
      if (hasRequestKind()) {
        hash = (37 * hash) + REQUESTKIND_FIELD_NUMBER;
        hash = (53 * hash) + getRequestKind().hashCode();
      }
      if (hasRequestResource()) {
        hash = (37 * hash) + REQUESTRESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getRequestResource().hashCode();
      }
      if (hasRequestSubResource()) {
        hash = (37 * hash) + REQUESTSUBRESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getRequestSubResource().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      if (hasOperation()) {
        hash = (37 * hash) + OPERATION_FIELD_NUMBER;
        hash = (53 * hash) + getOperation().hashCode();
      }
      if (hasUserInfo()) {
        hash = (37 * hash) + USERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getUserInfo().hashCode();
      }
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasOldObject()) {
        hash = (37 * hash) + OLDOBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getOldObject().hashCode();
      }
      if (hasDryRun()) {
        hash = (37 * hash) + DRYRUN_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDryRun());
      }
      if (hasOptions()) {
        hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getOptions().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Admission.AdmissionRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * AdmissionRequest describes the admission.Attributes for the admission request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1.AdmissionRequest}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1.AdmissionRequest)
        io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Admission.AdmissionRequest.class,
                io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Admission.AdmissionRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getKindFieldBuilder();
          getResourceFieldBuilder();
          getRequestKindFieldBuilder();
          getRequestResourceFieldBuilder();
          getUserInfoFieldBuilder();
          getObjectFieldBuilder();
          getOldObjectFieldBuilder();
          getOptionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (kindBuilder_ == null) {
          kind_ = null;
        } else {
          kindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        subResource_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        if (requestKindBuilder_ == null) {
          requestKind_ = null;
        } else {
          requestKindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (requestResourceBuilder_ == null) {
          requestResource_ = null;
        } else {
          requestResourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        requestSubResource_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        operation_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000400);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000800);
        if (oldObjectBuilder_ == null) {
          oldObject_ = null;
        } else {
          oldObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00001000);
        dryRun_ = false;
        bitField0_ = (bitField0_ & ~0x00002000);
        if (optionsBuilder_ == null) {
          options_ = null;
        } else {
          optionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00004000);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionRequest getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionRequest build() {
        io.kubernetes.client.proto.V1Admission.AdmissionRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionRequest buildPartial() {
        io.kubernetes.client.proto.V1Admission.AdmissionRequest result =
            new io.kubernetes.client.proto.V1Admission.AdmissionRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uid_ = uid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (kindBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = kindBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.subResource_ = subResource_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (requestKindBuilder_ == null) {
          result.requestKind_ = requestKind_;
        } else {
          result.requestKind_ = requestKindBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        if (requestResourceBuilder_ == null) {
          result.requestResource_ = requestResource_;
        } else {
          result.requestResource_ = requestResourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.requestSubResource_ = requestSubResource_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.operation_ = operation_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        if (userInfoBuilder_ == null) {
          result.userInfo_ = userInfo_;
        } else {
          result.userInfo_ = userInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        if (oldObjectBuilder_ == null) {
          result.oldObject_ = oldObject_;
        } else {
          result.oldObject_ = oldObjectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.dryRun_ = dryRun_;
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00004000;
        }
        if (optionsBuilder_ == null) {
          result.options_ = options_;
        } else {
          result.options_ = optionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Admission.AdmissionRequest) {
          return mergeFrom((io.kubernetes.client.proto.V1Admission.AdmissionRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Admission.AdmissionRequest other) {
        if (other == io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance())
          return this;
        if (other.hasUid()) {
          bitField0_ |= 0x00000001;
          uid_ = other.uid_;
          onChanged();
        }
        if (other.hasKind()) {
          mergeKind(other.getKind());
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasSubResource()) {
          bitField0_ |= 0x00000008;
          subResource_ = other.subResource_;
          onChanged();
        }
        if (other.hasRequestKind()) {
          mergeRequestKind(other.getRequestKind());
        }
        if (other.hasRequestResource()) {
          mergeRequestResource(other.getRequestResource());
        }
        if (other.hasRequestSubResource()) {
          bitField0_ |= 0x00000040;
          requestSubResource_ = other.requestSubResource_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000080;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000100;
          namespace_ = other.namespace_;
          onChanged();
        }
        if (other.hasOperation()) {
          bitField0_ |= 0x00000200;
          operation_ = other.operation_;
          onChanged();
        }
        if (other.hasUserInfo()) {
          mergeUserInfo(other.getUserInfo());
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasOldObject()) {
          mergeOldObject(other.getOldObject());
        }
        if (other.hasDryRun()) {
          setDryRun(other.getDryRun());
        }
        if (other.hasOptions()) {
          mergeOptions(other.getOptions());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Admission.AdmissionRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Admission.AdmissionRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object uid_ = "";
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public java.lang.String getUid() {
        java.lang.Object ref = uid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public com.google.protobuf.ByteString getUidBytes() {
        java.lang.Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder setUid(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are
       * otherwise identical (parallel requests, requests when earlier requests did not modify etc)
       * The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request.
       * It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder setUidBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.GroupVersionKind kind_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          kindBuilder_;
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind getKind() {
        if (kindBuilder_ == null) {
          return kind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : kind_;
        } else {
          return kindBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public Builder setKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (kindBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          kind_ = value;
          onChanged();
        } else {
          kindBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public Builder setKind(
          io.kubernetes.client.proto.Meta.GroupVersionKind.Builder builderForValue) {
        if (kindBuilder_ == null) {
          kind_ = builderForValue.build();
          onChanged();
        } else {
          kindBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public Builder mergeKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (kindBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && kind_ != null
              && kind_ != io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()) {
            kind_ =
                io.kubernetes.client.proto.Meta.GroupVersionKind.newBuilder(kind_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            kind_ = value;
          }
          onChanged();
        } else {
          kindBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public Builder clearKind() {
        if (kindBuilder_ == null) {
          kind_ = null;
          onChanged();
        } else {
          kindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind.Builder getKindBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getKindFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getKindOrBuilder() {
        if (kindBuilder_ != null) {
          return kindBuilder_.getMessageOrBuilder();
        } else {
          return kind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : kind_;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the fully-qualified type of object being submitted (for example, v1.Pod or autoscaling.v1.Scale)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind kind = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          getKindFieldBuilder() {
        if (kindBuilder_ == null) {
          kindBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionKind,
                  io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>(
                  getKind(), getParentForChildren(), isClean());
          kind_ = null;
        }
        return kindBuilder_;
      }

      private io.kubernetes.client.proto.Meta.GroupVersionResource resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public Builder setResource(io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.Meta.GroupVersionResource.Builder builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public Builder mergeResource(io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.Meta.GroupVersionResource.newBuilder(resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource.Builder getResourceBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is the fully-qualified resource being requested (for example, v1.pods)
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource resource = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionResource,
                  io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private java.lang.Object subResource_ = "";
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public boolean hasSubResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public java.lang.String getSubResource() {
        java.lang.Object ref = subResource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            subResource_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public com.google.protobuf.ByteString getSubResourceBytes() {
        java.lang.Object ref = subResource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          subResource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public Builder setSubResource(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        subResource_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public Builder clearSubResource() {
        bitField0_ = (bitField0_ & ~0x00000008);
        subResource_ = getDefaultInstance().getSubResource();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * SubResource is the subresource being requested, if any (for example, "status" or "scale")
       * +optional
       * </pre>
       *
       * <code>optional string subResource = 4;</code>
       */
      public Builder setSubResourceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        subResource_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.GroupVersionKind requestKind_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          requestKindBuilder_;
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public boolean hasRequestKind() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind getRequestKind() {
        if (requestKindBuilder_ == null) {
          return requestKind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : requestKind_;
        } else {
          return requestKindBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public Builder setRequestKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (requestKindBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          requestKind_ = value;
          onChanged();
        } else {
          requestKindBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public Builder setRequestKind(
          io.kubernetes.client.proto.Meta.GroupVersionKind.Builder builderForValue) {
        if (requestKindBuilder_ == null) {
          requestKind_ = builderForValue.build();
          onChanged();
        } else {
          requestKindBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public Builder mergeRequestKind(io.kubernetes.client.proto.Meta.GroupVersionKind value) {
        if (requestKindBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && requestKind_ != null
              && requestKind_
                  != io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()) {
            requestKind_ =
                io.kubernetes.client.proto.Meta.GroupVersionKind.newBuilder(requestKind_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            requestKind_ = value;
          }
          onChanged();
        } else {
          requestKindBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public Builder clearRequestKind() {
        if (requestKindBuilder_ == null) {
          requestKind_ = null;
          onChanged();
        } else {
          requestKindBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKind.Builder getRequestKindBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getRequestKindFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder getRequestKindOrBuilder() {
        if (requestKindBuilder_ != null) {
          return requestKindBuilder_.getMessageOrBuilder();
        } else {
          return requestKind_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionKind.getDefaultInstance()
              : requestKind_;
        }
      }
      /**
       *
       *
       * <pre>
       * RequestKind is the fully-qualified type of the original API request (for example, v1.Pod or autoscaling.v1.Scale).
       * If this is specified and differs from the value in "kind", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `kind: {group:"apps", version:"v1", kind:"Deployment"}` (matching the rule the webhook registered for),
       * and `requestKind: {group:"apps", version:"v1beta1", kind:"Deployment"}` (indicating the kind of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type for more details.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionKind requestKind = 13;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionKind,
              io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>
          getRequestKindFieldBuilder() {
        if (requestKindBuilder_ == null) {
          requestKindBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionKind,
                  io.kubernetes.client.proto.Meta.GroupVersionKind.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionKindOrBuilder>(
                  getRequestKind(), getParentForChildren(), isClean());
          requestKind_ = null;
        }
        return requestKindBuilder_;
      }

      private io.kubernetes.client.proto.Meta.GroupVersionResource requestResource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          requestResourceBuilder_;
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public boolean hasRequestResource() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource getRequestResource() {
        if (requestResourceBuilder_ == null) {
          return requestResource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : requestResource_;
        } else {
          return requestResourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public Builder setRequestResource(
          io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (requestResourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          requestResource_ = value;
          onChanged();
        } else {
          requestResourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public Builder setRequestResource(
          io.kubernetes.client.proto.Meta.GroupVersionResource.Builder builderForValue) {
        if (requestResourceBuilder_ == null) {
          requestResource_ = builderForValue.build();
          onChanged();
        } else {
          requestResourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public Builder mergeRequestResource(
          io.kubernetes.client.proto.Meta.GroupVersionResource value) {
        if (requestResourceBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)
              && requestResource_ != null
              && requestResource_
                  != io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()) {
            requestResource_ =
                io.kubernetes.client.proto.Meta.GroupVersionResource.newBuilder(requestResource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            requestResource_ = value;
          }
          onChanged();
        } else {
          requestResourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public Builder clearRequestResource() {
        if (requestResourceBuilder_ == null) {
          requestResource_ = null;
          onChanged();
        } else {
          requestResourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResource.Builder
          getRequestResourceBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getRequestResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder
          getRequestResourceOrBuilder() {
        if (requestResourceBuilder_ != null) {
          return requestResourceBuilder_.getMessageOrBuilder();
        } else {
          return requestResource_ == null
              ? io.kubernetes.client.proto.Meta.GroupVersionResource.getDefaultInstance()
              : requestResource_;
        }
      }
      /**
       *
       *
       * <pre>
       * RequestResource is the fully-qualified resource of the original API request (for example, v1.pods).
       * If this is specified and differs from the value in "resource", an equivalent match and conversion was performed.
       * For example, if deployments can be modified via apps/v1 and apps/v1beta1, and a webhook registered a rule of
       * `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]` and `matchPolicy: Equivalent`,
       * an API request to apps/v1beta1 deployments would be converted and sent to the webhook
       * with `resource: {group:"apps", version:"v1", resource:"deployments"}` (matching the resource the webhook registered for),
       * and `requestResource: {group:"apps", version:"v1beta1", resource:"deployments"}` (indicating the resource of the original API request).
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.GroupVersionResource requestResource = 14;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.GroupVersionResource,
              io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
              io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>
          getRequestResourceFieldBuilder() {
        if (requestResourceBuilder_ == null) {
          requestResourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.GroupVersionResource,
                  io.kubernetes.client.proto.Meta.GroupVersionResource.Builder,
                  io.kubernetes.client.proto.Meta.GroupVersionResourceOrBuilder>(
                  getRequestResource(), getParentForChildren(), isClean());
          requestResource_ = null;
        }
        return requestResourceBuilder_;
      }

      private java.lang.Object requestSubResource_ = "";
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public boolean hasRequestSubResource() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public java.lang.String getRequestSubResource() {
        java.lang.Object ref = requestSubResource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            requestSubResource_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public com.google.protobuf.ByteString getRequestSubResourceBytes() {
        java.lang.Object ref = requestSubResource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          requestSubResource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public Builder setRequestSubResource(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        requestSubResource_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public Builder clearRequestSubResource() {
        bitField0_ = (bitField0_ & ~0x00000040);
        requestSubResource_ = getDefaultInstance().getRequestSubResource();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequestSubResource is the name of the subresource of the original API request, if any (for example, "status" or "scale")
       * If this is specified and differs from the value in "subResource", an equivalent match and conversion was performed.
       * See documentation for the "matchPolicy" field in the webhook configuration type.
       * +optional
       * </pre>
       *
       * <code>optional string requestSubResource = 15;</code>
       */
      public Builder setRequestSubResourceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        requestSubResource_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000080);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and
       * rely on the server to generate the name.  If that is the case, this field will contain an empty string.
       * +optional
       * </pre>
       *
       * <code>optional string name = 5;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public java.lang.String getNamespace() {
        java.lang.Object ref = namespace_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namespace_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public com.google.protobuf.ByteString getNamespaceBytes() {
        java.lang.Object ref = namespace_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          namespace_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000100);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace associated with the request (if any).
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 6;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        namespace_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object operation_ = "";
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public boolean hasOperation() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public java.lang.String getOperation() {
        java.lang.Object ref = operation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            operation_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public com.google.protobuf.ByteString getOperationBytes() {
        java.lang.Object ref = operation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          operation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public Builder setOperation(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000200;
        operation_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public Builder clearOperation() {
        bitField0_ = (bitField0_ & ~0x00000200);
        operation_ = getDefaultInstance().getOperation();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Operation is the operation being performed. This may be different than the operation
       * requested. e.g. a patch can result in either a CREATE or UPDATE Operation.
       * </pre>
       *
       * <code>optional string operation = 7;</code>
       */
      public Builder setOperationBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000200;
        operation_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1Authentication.UserInfo userInfo_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Authentication.UserInfo,
              io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>
          userInfoBuilder_;
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public boolean hasUserInfo() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfo getUserInfo() {
        if (userInfoBuilder_ == null) {
          return userInfo_ == null
              ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
              : userInfo_;
        } else {
          return userInfoBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public Builder setUserInfo(io.kubernetes.client.proto.V1Authentication.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userInfo_ = value;
          onChanged();
        } else {
          userInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public Builder setUserInfo(
          io.kubernetes.client.proto.V1Authentication.UserInfo.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          userInfo_ = builderForValue.build();
          onChanged();
        } else {
          userInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public Builder mergeUserInfo(io.kubernetes.client.proto.V1Authentication.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000400) == 0x00000400)
              && userInfo_ != null
              && userInfo_
                  != io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()) {
            userInfo_ =
                io.kubernetes.client.proto.V1Authentication.UserInfo.newBuilder(userInfo_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            userInfo_ = value;
          }
          onChanged();
        } else {
          userInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public Builder clearUserInfo() {
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
          onChanged();
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfo.Builder getUserInfoBuilder() {
        bitField0_ |= 0x00000400;
        onChanged();
        return getUserInfoFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      public io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder getUserInfoOrBuilder() {
        if (userInfoBuilder_ != null) {
          return userInfoBuilder_.getMessageOrBuilder();
        } else {
          return userInfo_ == null
              ? io.kubernetes.client.proto.V1Authentication.UserInfo.getDefaultInstance()
              : userInfo_;
        }
      }
      /**
       *
       *
       * <pre>
       * UserInfo is information about the requesting user
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1.UserInfo userInfo = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Authentication.UserInfo,
              io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>
          getUserInfoFieldBuilder() {
        if (userInfoBuilder_ == null) {
          userInfoBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Authentication.UserInfo,
                  io.kubernetes.client.proto.V1Authentication.UserInfo.Builder,
                  io.kubernetes.client.proto.V1Authentication.UserInfoOrBuilder>(
                  getUserInfo(), getParentForChildren(), isClean());
          userInfo_ = null;
        }
        return userInfoBuilder_;
      }

      private io.kubernetes.client.proto.Runtime.RawExtension object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public Builder setObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.Runtime.RawExtension.Builder builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public Builder mergeObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000800) == 0x00000800)
              && object_ != null
              && object_ != io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.Runtime.RawExtension.newBuilder(object_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = null;
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000800);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension.Builder getObjectBuilder() {
        bitField0_ |= 0x00000800;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * Object is the object from the incoming request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension object = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.RawExtension,
                  io.kubernetes.client.proto.Runtime.RawExtension.Builder,
                  io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.Runtime.RawExtension oldObject_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          oldObjectBuilder_;
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public boolean hasOldObject() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension getOldObject() {
        if (oldObjectBuilder_ == null) {
          return oldObject_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : oldObject_;
        } else {
          return oldObjectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public Builder setOldObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (oldObjectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oldObject_ = value;
          onChanged();
        } else {
          oldObjectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public Builder setOldObject(
          io.kubernetes.client.proto.Runtime.RawExtension.Builder builderForValue) {
        if (oldObjectBuilder_ == null) {
          oldObject_ = builderForValue.build();
          onChanged();
        } else {
          oldObjectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public Builder mergeOldObject(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (oldObjectBuilder_ == null) {
          if (((bitField0_ & 0x00001000) == 0x00001000)
              && oldObject_ != null
              && oldObject_
                  != io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()) {
            oldObject_ =
                io.kubernetes.client.proto.Runtime.RawExtension.newBuilder(oldObject_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            oldObject_ = value;
          }
          onChanged();
        } else {
          oldObjectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public Builder clearOldObject() {
        if (oldObjectBuilder_ == null) {
          oldObject_ = null;
          onChanged();
        } else {
          oldObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension.Builder getOldObjectBuilder() {
        bitField0_ |= 0x00001000;
        onChanged();
        return getOldObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOldObjectOrBuilder() {
        if (oldObjectBuilder_ != null) {
          return oldObjectBuilder_.getMessageOrBuilder();
        } else {
          return oldObject_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : oldObject_;
        }
      }
      /**
       *
       *
       * <pre>
       * OldObject is the existing object. Only populated for DELETE and UPDATE requests.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension oldObject = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          getOldObjectFieldBuilder() {
        if (oldObjectBuilder_ == null) {
          oldObjectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.RawExtension,
                  io.kubernetes.client.proto.Runtime.RawExtension.Builder,
                  io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>(
                  getOldObject(), getParentForChildren(), isClean());
          oldObject_ = null;
        }
        return oldObjectBuilder_;
      }

      private boolean dryRun_;
      /**
       *
       *
       * <pre>
       * DryRun indicates that modifications will definitely not be persisted for this request.
       * Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool dryRun = 11;</code>
       */
      public boolean hasDryRun() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       *
       *
       * <pre>
       * DryRun indicates that modifications will definitely not be persisted for this request.
       * Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool dryRun = 11;</code>
       */
      public boolean getDryRun() {
        return dryRun_;
      }
      /**
       *
       *
       * <pre>
       * DryRun indicates that modifications will definitely not be persisted for this request.
       * Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool dryRun = 11;</code>
       */
      public Builder setDryRun(boolean value) {
        bitField0_ |= 0x00002000;
        dryRun_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * DryRun indicates that modifications will definitely not be persisted for this request.
       * Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool dryRun = 11;</code>
       */
      public Builder clearDryRun() {
        bitField0_ = (bitField0_ & ~0x00002000);
        dryRun_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Runtime.RawExtension options_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          optionsBuilder_;
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public boolean hasOptions() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension getOptions() {
        if (optionsBuilder_ == null) {
          return options_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : options_;
        } else {
          return optionsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public Builder setOptions(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (optionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          options_ = value;
          onChanged();
        } else {
          optionsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00004000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public Builder setOptions(
          io.kubernetes.client.proto.Runtime.RawExtension.Builder builderForValue) {
        if (optionsBuilder_ == null) {
          options_ = builderForValue.build();
          onChanged();
        } else {
          optionsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00004000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public Builder mergeOptions(io.kubernetes.client.proto.Runtime.RawExtension value) {
        if (optionsBuilder_ == null) {
          if (((bitField0_ & 0x00004000) == 0x00004000)
              && options_ != null
              && options_ != io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()) {
            options_ =
                io.kubernetes.client.proto.Runtime.RawExtension.newBuilder(options_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            options_ = value;
          }
          onChanged();
        } else {
          optionsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00004000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public Builder clearOptions() {
        if (optionsBuilder_ == null) {
          options_ = null;
          onChanged();
        } else {
          optionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00004000);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtension.Builder getOptionsBuilder() {
        bitField0_ |= 0x00004000;
        onChanged();
        return getOptionsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      public io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder getOptionsOrBuilder() {
        if (optionsBuilder_ != null) {
          return optionsBuilder_.getMessageOrBuilder();
        } else {
          return options_ == null
              ? io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance()
              : options_;
        }
      }
      /**
       *
       *
       * <pre>
       * Options is the operation option structure of the operation being performed.
       * e.g. `meta.k8s.io/v1.DeleteOptions` or `meta.k8s.io/v1.CreateOptions`. This may be
       * different than the options the caller provided. e.g. for a patch request the performed
       * Operation might be a CREATE, in which case the Options will a
       * `meta.k8s.io/v1.CreateOptions` even though the caller provided `meta.k8s.io/v1.PatchOptions`.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.runtime.RawExtension options = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.RawExtension,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder,
              io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>
          getOptionsFieldBuilder() {
        if (optionsBuilder_ == null) {
          optionsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.RawExtension,
                  io.kubernetes.client.proto.Runtime.RawExtension.Builder,
                  io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder>(
                  getOptions(), getParentForChildren(), isClean());
          options_ = null;
        }
        return optionsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1.AdmissionRequest)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1.AdmissionRequest)
    private static final io.kubernetes.client.proto.V1Admission.AdmissionRequest DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Admission.AdmissionRequest();
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionRequest> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionRequest>() {
          @java.lang.Override
          public AdmissionRequest parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionRequest(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Admission.AdmissionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface AdmissionResponseOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1.AdmissionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    boolean hasUid();
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    java.lang.String getUid();
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    com.google.protobuf.ByteString getUidBytes();

    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 2;</code>
     */
    boolean hasAllowed();
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 2;</code>
     */
    boolean getAllowed();

    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    io.kubernetes.client.proto.Meta.Status getStatus();
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder();

    /**
     *
     *
     * <pre>
     * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
     * +optional
     * </pre>
     *
     * <code>optional bytes patch = 4;</code>
     */
    boolean hasPatch();
    /**
     *
     *
     * <pre>
     * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
     * +optional
     * </pre>
     *
     * <code>optional bytes patch = 4;</code>
     */
    com.google.protobuf.ByteString getPatch();

    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    boolean hasPatchType();
    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    java.lang.String getPatchType();
    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    com.google.protobuf.ByteString getPatchTypeBytes();

    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    int getAuditAnnotationsCount();
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    boolean containsAuditAnnotations(java.lang.String key);
    /** Use {@link #getAuditAnnotationsMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getAuditAnnotations();
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap();
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    java.lang.String getAuditAnnotationsOrDefault(
        java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    java.lang.String getAuditAnnotationsOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    java.util.List<java.lang.String> getWarningsList();
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    int getWarningsCount();
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    java.lang.String getWarnings(int index);
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    com.google.protobuf.ByteString getWarningsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * AdmissionResponse describes an admission response.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1.AdmissionResponse}
   */
  public static final class AdmissionResponse extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1.AdmissionResponse)
      AdmissionResponseOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionResponse.newBuilder() to construct.
    private AdmissionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionResponse() {
      uid_ = "";
      allowed_ = false;
      patch_ = com.google.protobuf.ByteString.EMPTY;
      patchType_ = "";
      warnings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                uid_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                allowed_ = input.readBool();
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.Status.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Status.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                bitField0_ |= 0x00000008;
                patch_ = input.readBytes();
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                patchType_ = bs;
                break;
              }
            case 50:
              {
                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                  auditAnnotations_ =
                      com.google.protobuf.MapField.newMapField(
                          AuditAnnotationsDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000020;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    auditAnnotations__ =
                        input.readMessage(
                            AuditAnnotationsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                auditAnnotations_
                    .getMutableMap()
                    .put(auditAnnotations__.getKey(), auditAnnotations__.getValue());
                break;
              }
            case 58:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                  warnings_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000040;
                }
                warnings_.add(bs);
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          warnings_ = warnings_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 6:
          return internalGetAuditAnnotations();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Admission.AdmissionResponse.class,
              io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder.class);
    }

    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private volatile java.lang.Object uid_;
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * UID is an identifier for the individual request/response.
     * This must be copied over from the corresponding AdmissionRequest.
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOWED_FIELD_NUMBER = 2;
    private boolean allowed_;
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 2;</code>
     */
    public boolean hasAllowed() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Allowed indicates whether or not the admission request was permitted.
     * </pre>
     *
     * <code>optional bool allowed = 2;</code>
     */
    public boolean getAllowed() {
      return allowed_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.Status status_;
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.Status getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Result contains extra details into why an admission request was denied.
     * This field IS NOT consulted in any way if "Allowed" is "true".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
          : status_;
    }

    public static final int PATCH_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString patch_;
    /**
     *
     *
     * <pre>
     * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
     * +optional
     * </pre>
     *
     * <code>optional bytes patch = 4;</code>
     */
    public boolean hasPatch() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
     * +optional
     * </pre>
     *
     * <code>optional bytes patch = 4;</code>
     */
    public com.google.protobuf.ByteString getPatch() {
      return patch_;
    }

    public static final int PATCHTYPE_FIELD_NUMBER = 5;
    private volatile java.lang.Object patchType_;
    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    public boolean hasPatchType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    public java.lang.String getPatchType() {
      java.lang.Object ref = patchType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          patchType_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of Patch. Currently we only allow "JSONPatch".
     * +optional
     * </pre>
     *
     * <code>optional string patchType = 5;</code>
     */
    public com.google.protobuf.ByteString getPatchTypeBytes() {
      java.lang.Object ref = patchType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        patchType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUDITANNOTATIONS_FIELD_NUMBER = 6;

    private static final class AuditAnnotationsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1Admission
                  .internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> auditAnnotations_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAuditAnnotations() {
      if (auditAnnotations_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AuditAnnotationsDefaultEntryHolder.defaultEntry);
      }
      return auditAnnotations_;
    }

    public int getAuditAnnotationsCount() {
      return internalGetAuditAnnotations().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    public boolean containsAuditAnnotations(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetAuditAnnotations().getMap().containsKey(key);
    }
    /** Use {@link #getAuditAnnotationsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotations() {
      return getAuditAnnotationsMap();
    }
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap() {
      return internalGetAuditAnnotations().getMap();
    }
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    public java.lang.String getAuditAnnotationsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAuditAnnotations().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
     * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
     * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
     * the admission webhook to add additional context to the audit log for this request.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
     */
    public java.lang.String getAuditAnnotationsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAuditAnnotations().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int WARNINGS_FIELD_NUMBER = 7;
    private com.google.protobuf.LazyStringList warnings_;
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    public com.google.protobuf.ProtocolStringList getWarningsList() {
      return warnings_;
    }
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    public int getWarningsCount() {
      return warnings_.size();
    }
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    public java.lang.String getWarnings(int index) {
      return warnings_.get(index);
    }
    /**
     *
     *
     * <pre>
     * warnings is a list of warning messages to return to the requesting API client.
     * Warning messages describe a problem the client making the API request should correct or be aware of.
     * Limit warnings to 120 characters if possible.
     * Warnings over 256 characters and large numbers of warnings may be truncated.
     * +optional
     * </pre>
     *
     * <code>repeated string warnings = 7;</code>
     */
    public com.google.protobuf.ByteString getWarningsBytes(int index) {
      return warnings_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, allowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, patch_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, patchType_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output,
          internalGetAuditAnnotations(),
          AuditAnnotationsDefaultEntryHolder.defaultEntry,
          6);
      for (int i = 0; i < warnings_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, warnings_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, patch_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, patchType_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetAuditAnnotations().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> auditAnnotations__ =
            AuditAnnotationsDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, auditAnnotations__);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < warnings_.size(); i++) {
          dataSize += computeStringSizeNoTag(warnings_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getWarningsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Admission.AdmissionResponse)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Admission.AdmissionResponse other =
          (io.kubernetes.client.proto.V1Admission.AdmissionResponse) obj;

      boolean result = true;
      result = result && (hasUid() == other.hasUid());
      if (hasUid()) {
        result = result && getUid().equals(other.getUid());
      }
      result = result && (hasAllowed() == other.hasAllowed());
      if (hasAllowed()) {
        result = result && (getAllowed() == other.getAllowed());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && (hasPatch() == other.hasPatch());
      if (hasPatch()) {
        result = result && getPatch().equals(other.getPatch());
      }
      result = result && (hasPatchType() == other.hasPatchType());
      if (hasPatchType()) {
        result = result && getPatchType().equals(other.getPatchType());
      }
      result = result && internalGetAuditAnnotations().equals(other.internalGetAuditAnnotations());
      result = result && getWarningsList().equals(other.getWarningsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      if (hasAllowed()) {
        hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowed());
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasPatch()) {
        hash = (37 * hash) + PATCH_FIELD_NUMBER;
        hash = (53 * hash) + getPatch().hashCode();
      }
      if (hasPatchType()) {
        hash = (37 * hash) + PATCHTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getPatchType().hashCode();
      }
      if (!internalGetAuditAnnotations().getMap().isEmpty()) {
        hash = (37 * hash) + AUDITANNOTATIONS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAuditAnnotations().hashCode();
      }
      if (getWarningsCount() > 0) {
        hash = (37 * hash) + WARNINGS_FIELD_NUMBER;
        hash = (53 * hash) + getWarningsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Admission.AdmissionResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * AdmissionResponse describes an admission response.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1.AdmissionResponse}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1.AdmissionResponse)
        io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 6:
            return internalGetAuditAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 6:
            return internalGetMutableAuditAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Admission.AdmissionResponse.class,
                io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Admission.AdmissionResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        allowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        patch_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        patchType_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        internalGetMutableAuditAnnotations().clear();
        warnings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionResponse getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionResponse build() {
        io.kubernetes.client.proto.V1Admission.AdmissionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionResponse buildPartial() {
        io.kubernetes.client.proto.V1Admission.AdmissionResponse result =
            new io.kubernetes.client.proto.V1Admission.AdmissionResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uid_ = uid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.allowed_ = allowed_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.patch_ = patch_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.patchType_ = patchType_;
        result.auditAnnotations_ = internalGetAuditAnnotations();
        result.auditAnnotations_.makeImmutable();
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          warnings_ = warnings_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.warnings_ = warnings_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Admission.AdmissionResponse) {
          return mergeFrom((io.kubernetes.client.proto.V1Admission.AdmissionResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Admission.AdmissionResponse other) {
        if (other == io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance())
          return this;
        if (other.hasUid()) {
          bitField0_ |= 0x00000001;
          uid_ = other.uid_;
          onChanged();
        }
        if (other.hasAllowed()) {
          setAllowed(other.getAllowed());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        if (other.hasPatch()) {
          setPatch(other.getPatch());
        }
        if (other.hasPatchType()) {
          bitField0_ |= 0x00000010;
          patchType_ = other.patchType_;
          onChanged();
        }
        internalGetMutableAuditAnnotations().mergeFrom(other.internalGetAuditAnnotations());
        if (!other.warnings_.isEmpty()) {
          if (warnings_.isEmpty()) {
            warnings_ = other.warnings_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureWarningsIsMutable();
            warnings_.addAll(other.warnings_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Admission.AdmissionResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Admission.AdmissionResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object uid_ = "";
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public java.lang.String getUid() {
        java.lang.Object ref = uid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public com.google.protobuf.ByteString getUidBytes() {
        java.lang.Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder setUid(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID is an identifier for the individual request/response.
       * This must be copied over from the corresponding AdmissionRequest.
       * </pre>
       *
       * <code>optional string uid = 1;</code>
       */
      public Builder setUidBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
        return this;
      }

      private boolean allowed_;
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 2;</code>
       */
      public boolean hasAllowed() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 2;</code>
       */
      public boolean getAllowed() {
        return allowed_;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 2;</code>
       */
      public Builder setAllowed(boolean value) {
        bitField0_ |= 0x00000002;
        allowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates whether or not the admission request was permitted.
       * </pre>
       *
       * <code>optional bool allowed = 2;</code>
       */
      public Builder clearAllowed() {
        bitField0_ = (bitField0_ & ~0x00000002);
        allowed_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Status status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Status,
              io.kubernetes.client.proto.Meta.Status.Builder,
              io.kubernetes.client.proto.Meta.StatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Status getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.Meta.Status value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.Meta.Status.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public Builder mergeStatus(io.kubernetes.client.proto.Meta.Status value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_ != io.kubernetes.client.proto.Meta.Status.getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.Meta.Status.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Status.Builder getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.StatusOrBuilder getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.Meta.Status.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Result contains extra details into why an admission request was denied.
       * This field IS NOT consulted in any way if "Allowed" is "true".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Status status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Status,
              io.kubernetes.client.proto.Meta.Status.Builder,
              io.kubernetes.client.proto.Meta.StatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Status,
                  io.kubernetes.client.proto.Meta.Status.Builder,
                  io.kubernetes.client.proto.Meta.StatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      private com.google.protobuf.ByteString patch_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
       * +optional
       * </pre>
       *
       * <code>optional bytes patch = 4;</code>
       */
      public boolean hasPatch() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
       * +optional
       * </pre>
       *
       * <code>optional bytes patch = 4;</code>
       */
      public com.google.protobuf.ByteString getPatch() {
        return patch_;
      }
      /**
       *
       *
       * <pre>
       * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
       * +optional
       * </pre>
       *
       * <code>optional bytes patch = 4;</code>
       */
      public Builder setPatch(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        patch_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The patch body. Currently we only support "JSONPatch" which implements RFC 6902.
       * +optional
       * </pre>
       *
       * <code>optional bytes patch = 4;</code>
       */
      public Builder clearPatch() {
        bitField0_ = (bitField0_ & ~0x00000008);
        patch_ = getDefaultInstance().getPatch();
        onChanged();
        return this;
      }

      private java.lang.Object patchType_ = "";
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public boolean hasPatchType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public java.lang.String getPatchType() {
        java.lang.Object ref = patchType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            patchType_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public com.google.protobuf.ByteString getPatchTypeBytes() {
        java.lang.Object ref = patchType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          patchType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public Builder setPatchType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        patchType_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public Builder clearPatchType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        patchType_ = getDefaultInstance().getPatchType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The type of Patch. Currently we only allow "JSONPatch".
       * +optional
       * </pre>
       *
       * <code>optional string patchType = 5;</code>
       */
      public Builder setPatchTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        patchType_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> auditAnnotations_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetAuditAnnotations() {
        if (auditAnnotations_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AuditAnnotationsDefaultEntryHolder.defaultEntry);
        }
        return auditAnnotations_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableAuditAnnotations() {
        onChanged();
        ;
        if (auditAnnotations_ == null) {
          auditAnnotations_ =
              com.google.protobuf.MapField.newMapField(
                  AuditAnnotationsDefaultEntryHolder.defaultEntry);
        }
        if (!auditAnnotations_.isMutable()) {
          auditAnnotations_ = auditAnnotations_.copy();
        }
        return auditAnnotations_;
      }

      public int getAuditAnnotationsCount() {
        return internalGetAuditAnnotations().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public boolean containsAuditAnnotations(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetAuditAnnotations().getMap().containsKey(key);
      }
      /** Use {@link #getAuditAnnotationsMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotations() {
        return getAuditAnnotationsMap();
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap() {
        return internalGetAuditAnnotations().getMap();
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public java.lang.String getAuditAnnotationsOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAuditAnnotations().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public java.lang.String getAuditAnnotationsOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAuditAnnotations().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAuditAnnotations() {
        internalGetMutableAuditAnnotations().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public Builder removeAuditAnnotations(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAuditAnnotations().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableAuditAnnotations() {
        return internalGetMutableAuditAnnotations().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public Builder putAuditAnnotations(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAuditAnnotations().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted).
       * MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with
       * admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by
       * the admission webhook to add additional context to the audit log for this request.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 6;</code>
       */
      public Builder putAllAuditAnnotations(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableAuditAnnotations().getMutableMap().putAll(values);
        return this;
      }

      private com.google.protobuf.LazyStringList warnings_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureWarningsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          warnings_ = new com.google.protobuf.LazyStringArrayList(warnings_);
          bitField0_ |= 0x00000040;
        }
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public com.google.protobuf.ProtocolStringList getWarningsList() {
        return warnings_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public int getWarningsCount() {
        return warnings_.size();
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public java.lang.String getWarnings(int index) {
        return warnings_.get(index);
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public com.google.protobuf.ByteString getWarningsBytes(int index) {
        return warnings_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public Builder setWarnings(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public Builder addWarnings(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public Builder addAllWarnings(java.lang.Iterable<java.lang.String> values) {
        ensureWarningsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, warnings_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public Builder clearWarnings() {
        warnings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * warnings is a list of warning messages to return to the requesting API client.
       * Warning messages describe a problem the client making the API request should correct or be aware of.
       * Limit warnings to 120 characters if possible.
       * Warnings over 256 characters and large numbers of warnings may be truncated.
       * +optional
       * </pre>
       *
       * <code>repeated string warnings = 7;</code>
       */
      public Builder addWarningsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1.AdmissionResponse)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1.AdmissionResponse)
    private static final io.kubernetes.client.proto.V1Admission.AdmissionResponse DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Admission.AdmissionResponse();
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionResponse> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionResponse>() {
          @java.lang.Override
          public AdmissionResponse parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionResponse(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Admission.AdmissionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface AdmissionReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.admission.v1.AdmissionReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    boolean hasRequest();
    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    io.kubernetes.client.proto.V1Admission.AdmissionRequest getRequest();
    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder getRequestOrBuilder();

    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    boolean hasResponse();
    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    io.kubernetes.client.proto.V1Admission.AdmissionResponse getResponse();
    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder getResponseOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * AdmissionReview describes an admission review request/response.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.admission.v1.AdmissionReview}
   */
  public static final class AdmissionReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.admission.v1.AdmissionReview)
      AdmissionReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AdmissionReview.newBuilder() to construct.
    private AdmissionReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AdmissionReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AdmissionReview(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = request_.toBuilder();
                }
                request_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Admission.AdmissionRequest.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(request_);
                  request_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = response_.toBuilder();
                }
                response_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Admission.AdmissionResponse.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(response_);
                  response_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Admission
          .internal_static_k8s_io_api_admission_v1_AdmissionReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Admission.AdmissionReview.class,
              io.kubernetes.client.proto.V1Admission.AdmissionReview.Builder.class);
    }

    private int bitField0_;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1Admission.AdmissionRequest request_;
    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    public io.kubernetes.client.proto.V1Admission.AdmissionRequest getRequest() {
      return request_ == null
          ? io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance()
          : request_;
    }
    /**
     *
     *
     * <pre>
     * Request describes the attributes for the admission request.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
     */
    public io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder getRequestOrBuilder() {
      return request_ == null
          ? io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance()
          : request_;
    }

    public static final int RESPONSE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Admission.AdmissionResponse response_;
    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    public io.kubernetes.client.proto.V1Admission.AdmissionResponse getResponse() {
      return response_ == null
          ? io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance()
          : response_;
    }
    /**
     *
     *
     * <pre>
     * Response describes the attributes for the admission response.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
     */
    public io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder
        getResponseOrBuilder() {
      return response_ == null
          ? io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance()
          : response_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getRequest());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getResponse());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRequest());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResponse());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Admission.AdmissionReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Admission.AdmissionReview other =
          (io.kubernetes.client.proto.V1Admission.AdmissionReview) obj;

      boolean result = true;
      result = result && (hasRequest() == other.hasRequest());
      if (hasRequest()) {
        result = result && getRequest().equals(other.getRequest());
      }
      result = result && (hasResponse() == other.hasResponse());
      if (hasResponse()) {
        result = result && getResponse().equals(other.getResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRequest()) {
        hash = (37 * hash) + REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getRequest().hashCode();
      }
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Admission.AdmissionReview prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * AdmissionReview describes an admission review request/response.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.admission.v1.AdmissionReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.admission.v1.AdmissionReview)
        io.kubernetes.client.proto.V1Admission.AdmissionReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Admission.AdmissionReview.class,
                io.kubernetes.client.proto.V1Admission.AdmissionReview.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Admission.AdmissionReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRequestFieldBuilder();
          getResponseFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (requestBuilder_ == null) {
          request_ = null;
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (responseBuilder_ == null) {
          response_ = null;
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Admission
            .internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionReview getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Admission.AdmissionReview.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionReview build() {
        io.kubernetes.client.proto.V1Admission.AdmissionReview result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Admission.AdmissionReview buildPartial() {
        io.kubernetes.client.proto.V1Admission.AdmissionReview result =
            new io.kubernetes.client.proto.V1Admission.AdmissionReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (requestBuilder_ == null) {
          result.request_ = request_;
        } else {
          result.request_ = requestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Admission.AdmissionReview) {
          return mergeFrom((io.kubernetes.client.proto.V1Admission.AdmissionReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Admission.AdmissionReview other) {
        if (other == io.kubernetes.client.proto.V1Admission.AdmissionReview.getDefaultInstance())
          return this;
        if (other.hasRequest()) {
          mergeRequest(other.getRequest());
        }
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Admission.AdmissionReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Admission.AdmissionReview) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V1Admission.AdmissionRequest request_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Admission.AdmissionRequest,
              io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder,
              io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder>
          requestBuilder_;
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionRequest getRequest() {
        if (requestBuilder_ == null) {
          return request_ == null
              ? io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance()
              : request_;
        } else {
          return requestBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public Builder setRequest(io.kubernetes.client.proto.V1Admission.AdmissionRequest value) {
        if (requestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          request_ = value;
          onChanged();
        } else {
          requestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public Builder setRequest(
          io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder builderForValue) {
        if (requestBuilder_ == null) {
          request_ = builderForValue.build();
          onChanged();
        } else {
          requestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public Builder mergeRequest(io.kubernetes.client.proto.V1Admission.AdmissionRequest value) {
        if (requestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && request_ != null
              && request_
                  != io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance()) {
            request_ =
                io.kubernetes.client.proto.V1Admission.AdmissionRequest.newBuilder(request_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            request_ = value;
          }
          onChanged();
        } else {
          requestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public Builder clearRequest() {
        if (requestBuilder_ == null) {
          request_ = null;
          onChanged();
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder getRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRequestFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder
          getRequestOrBuilder() {
        if (requestBuilder_ != null) {
          return requestBuilder_.getMessageOrBuilder();
        } else {
          return request_ == null
              ? io.kubernetes.client.proto.V1Admission.AdmissionRequest.getDefaultInstance()
              : request_;
        }
      }
      /**
       *
       *
       * <pre>
       * Request describes the attributes for the admission request.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionRequest request = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Admission.AdmissionRequest,
              io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder,
              io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder>
          getRequestFieldBuilder() {
        if (requestBuilder_ == null) {
          requestBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Admission.AdmissionRequest,
                  io.kubernetes.client.proto.V1Admission.AdmissionRequest.Builder,
                  io.kubernetes.client.proto.V1Admission.AdmissionRequestOrBuilder>(
                  getRequest(), getParentForChildren(), isClean());
          request_ = null;
        }
        return requestBuilder_;
      }

      private io.kubernetes.client.proto.V1Admission.AdmissionResponse response_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Admission.AdmissionResponse,
              io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder,
              io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder>
          responseBuilder_;
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionResponse getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null
              ? io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance()
              : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public Builder setResponse(io.kubernetes.client.proto.V1Admission.AdmissionResponse value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public Builder setResponse(
          io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public Builder mergeResponse(io.kubernetes.client.proto.V1Admission.AdmissionResponse value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && response_ != null
              && response_
                  != io.kubernetes.client.proto.V1Admission.AdmissionResponse
                      .getDefaultInstance()) {
            response_ =
                io.kubernetes.client.proto.V1Admission.AdmissionResponse.newBuilder(response_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = null;
          onChanged();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder getResponseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      public io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder
          getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null
              ? io.kubernetes.client.proto.V1Admission.AdmissionResponse.getDefaultInstance()
              : response_;
        }
      }
      /**
       *
       *
       * <pre>
       * Response describes the attributes for the admission response.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.admission.v1.AdmissionResponse response = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Admission.AdmissionResponse,
              io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder,
              io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder>
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Admission.AdmissionResponse,
                  io.kubernetes.client.proto.V1Admission.AdmissionResponse.Builder,
                  io.kubernetes.client.proto.V1Admission.AdmissionResponseOrBuilder>(
                  getResponse(), getParentForChildren(), isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.admission.v1.AdmissionReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.admission.v1.AdmissionReview)
    private static final io.kubernetes.client.proto.V1Admission.AdmissionReview DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Admission.AdmissionReview();
    }

    public static io.kubernetes.client.proto.V1Admission.AdmissionReview getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AdmissionReview> PARSER =
        new com.google.protobuf.AbstractParser<AdmissionReview>() {
          @java.lang.Override
          public AdmissionReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AdmissionReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AdmissionReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdmissionReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Admission.AdmissionReview getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1_AdmissionRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1_AdmissionResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_admission_v1_AdmissionReview_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'k8s.io/api/admission/v1/generated.prot"
          + "o\022\027k8s.io.api.admission.v1\032,k8s.io/api/a"
          + "uthentication/v1/generated.proto\0324k8s.io"
          + "/apimachinery/pkg/apis/meta/v1/generated"
          + ".proto\032/k8s.io/apimachinery/pkg/runtime/"
          + "generated.proto\0326k8s.io/apimachinery/pkg"
          + "/runtime/schema/generated.proto\"\305\005\n\020Admi"
          + "ssionRequest\022\013\n\003uid\030\001 \001(\t\022D\n\004kind\030\002 \001(\0132"
          + "6.k8s.io.apimachinery.pkg.apis.meta.v1.G"
          + "roupVersionKind\022L\n\010resource\030\003 \001(\0132:.k8s."
          + "io.apimachinery.pkg.apis.meta.v1.GroupVe"
          + "rsionResource\022\023\n\013subResource\030\004 \001(\t\022K\n\013re"
          + "questKind\030\r \001(\01326.k8s.io.apimachinery.pk"
          + "g.apis.meta.v1.GroupVersionKind\022S\n\017reque"
          + "stResource\030\016 \001(\0132:.k8s.io.apimachinery.p"
          + "kg.apis.meta.v1.GroupVersionResource\022\032\n\022"
          + "requestSubResource\030\017 \001(\t\022\014\n\004name\030\005 \001(\t\022\021"
          + "\n\tnamespace\030\006 \001(\t\022\021\n\toperation\030\007 \001(\t\0228\n\010"
          + "userInfo\030\010 \001(\0132&.k8s.io.api.authenticati"
          + "on.v1.UserInfo\022=\n\006object\030\t \001(\0132-.k8s.io."
          + "apimachinery.pkg.runtime.RawExtension\022@\n"
          + "\toldObject\030\n \001(\0132-.k8s.io.apimachinery.p"
          + "kg.runtime.RawExtension\022\016\n\006dryRun\030\013 \001(\010\022"
          + ">\n\007options\030\014 \001(\0132-.k8s.io.apimachinery.p"
          + "kg.runtime.RawExtension\"\270\002\n\021AdmissionRes"
          + "ponse\022\013\n\003uid\030\001 \001(\t\022\017\n\007allowed\030\002 \001(\010\022<\n\006s"
          + "tatus\030\003 \001(\0132,.k8s.io.apimachinery.pkg.ap"
          + "is.meta.v1.Status\022\r\n\005patch\030\004 \001(\014\022\021\n\tpatc"
          + "hType\030\005 \001(\t\022Z\n\020auditAnnotations\030\006 \003(\0132@."
          + "k8s.io.api.admission.v1.AdmissionRespons"
          + "e.AuditAnnotationsEntry\022\020\n\010warnings\030\007 \003("
          + "\t\0327\n\025AuditAnnotationsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\213\001\n\017AdmissionReview\022:"
          + "\n\007request\030\001 \001(\0132).k8s.io.api.admission.v"
          + "1.AdmissionRequest\022<\n\010response\030\002 \001(\0132*.k"
          + "8s.io.api.admission.v1.AdmissionResponse"
          + "B-\n\032io.kubernetes.client.protoB\013V1Admiss"
          + "ionZ\002v1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1Authentication.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_admission_v1_AdmissionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1_AdmissionRequest_descriptor,
            new java.lang.String[] {
              "Uid",
              "Kind",
              "Resource",
              "SubResource",
              "RequestKind",
              "RequestResource",
              "RequestSubResource",
              "Name",
              "Namespace",
              "Operation",
              "UserInfo",
              "Object",
              "OldObject",
              "DryRun",
              "Options",
            });
    internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_admission_v1_AdmissionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor,
            new java.lang.String[] {
              "Uid", "Allowed", "Status", "Patch", "PatchType", "AuditAnnotations", "Warnings",
            });
    internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_descriptor =
        internal_static_k8s_io_api_admission_v1_AdmissionResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1_AdmissionResponse_AuditAnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_admission_v1_AdmissionReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_admission_v1_AdmissionReview_descriptor,
            new java.lang.String[] {
              "Request", "Response",
            });
    io.kubernetes.client.proto.V1Authentication.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
