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

public final class V1alpha1Imagepolicy {
  private V1alpha1Imagepolicy() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface ImageReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.imagepolicy.v1alpha1.ImageReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ImageReview checks if the set of images in a pod are allowed.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReview}
   */
  public static final class ImageReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReview)
      ImageReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ImageReview.newBuilder() to construct.
    private ImageReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ImageReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ImageReview(
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
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.class,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the pod being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the backend and indicates whether the pod should be allowed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.getDefaultInstance()
          : status_;
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
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview other =
          (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
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
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview prototype) {
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
     * ImageReview checks if the set of images in a pod are allowed.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReview)
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.class,
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview build() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview buildPartial() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview result =
            new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the pod being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus value) {
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
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder
              builderForValue) {
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
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.newBuilder(status_)
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
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
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
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the backend and indicates whether the pod should be allowed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReview)
    private static final io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview();
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ImageReview> PARSER =
        new com.google.protobuf.AbstractParser<ImageReview>() {
          @java.lang.Override
          public ImageReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ImageReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ImageReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReview getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ImageReviewContainerSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    boolean hasImage();
    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    java.lang.String getImage();
    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    com.google.protobuf.ByteString getImageBytes();
  }
  /**
   *
   *
   * <pre>
   * ImageReviewContainerSpec is a description of a container within the pod creation request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec}
   */
  public static final class ImageReviewContainerSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec)
      ImageReviewContainerSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ImageReviewContainerSpec.newBuilder() to construct.
    private ImageReviewContainerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ImageReviewContainerSpec() {
      image_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ImageReviewContainerSpec(
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
                image_ = bs;
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
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.class,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object image_;
    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    public boolean hasImage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    public java.lang.String getImage() {
      java.lang.Object ref = image_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          image_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
     * +optional
     * </pre>
     *
     * <code>optional string image = 1;</code>
     */
    public com.google.protobuf.ByteString getImageBytes() {
      java.lang.Object ref = image_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        image_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, image_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, image_);
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec other =
          (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec) obj;

      boolean result = true;
      result = result && (hasImage() == other.hasImage());
      if (hasImage()) {
        result = result && getImage().equals(other.getImage());
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
      if (hasImage()) {
        hash = (37 * hash) + IMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getImage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec prototype) {
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
     * ImageReviewContainerSpec is a description of a container within the pod creation request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec)
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.class,
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        image_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec build() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
          buildPartial() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec result =
            new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.image_ = image_;
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
        if (other
            instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
                .getDefaultInstance()) return this;
        if (other.hasImage()) {
          bitField0_ |= 0x00000001;
          image_ = other.image_;
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object image_ = "";
      /**
       *
       *
       * <pre>
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public boolean hasImage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public java.lang.String getImage() {
        java.lang.Object ref = image_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            image_ = s;
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
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public com.google.protobuf.ByteString getImageBytes() {
        java.lang.Object ref = image_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          image_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public Builder setImage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        image_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public Builder clearImage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        image_ = getDefaultInstance().getImage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * This can be in the form image:tag or image&#64;SHA:012345679abcdef.
       * +optional
       * </pre>
       *
       * <code>optional string image = 1;</code>
       */
      public Builder setImageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        image_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec)
    private static final io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec();
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ImageReviewContainerSpec> PARSER =
        new com.google.protobuf.AbstractParser<ImageReviewContainerSpec>() {
          @java.lang.Override
          public ImageReviewContainerSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ImageReviewContainerSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ImageReviewContainerSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageReviewContainerSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ImageReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
        getContainersList();
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec getContainers(
        int index);
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    int getContainersCount();
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>
        getContainersOrBuilderList();
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder
        getContainersOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    int getAnnotationsCount();
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    boolean containsAnnotations(java.lang.String key);
    /** Use {@link #getAnnotationsMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getAnnotations();
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    java.lang.String getAnnotationsOrDefault(java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    java.lang.String getAnnotationsOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();
  }
  /**
   *
   *
   * <pre>
   * ImageReviewSpec is a description of the pod creation request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec}
   */
  public static final class ImageReviewSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec)
      ImageReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ImageReviewSpec.newBuilder() to construct.
    private ImageReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ImageReviewSpec() {
      containers_ = java.util.Collections.emptyList();
      namespace_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ImageReviewSpec(
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  containers_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Imagepolicy
                              .ImageReviewContainerSpec>();
                  mutable_bitField0_ |= 0x00000001;
                }
                containers_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
                            .PARSER,
                        extensionRegistry));
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  annotations_ =
                      com.google.protobuf.MapField.newMapField(
                          AnnotationsDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000002;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> annotations__ =
                    input.readMessage(
                        AnnotationsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                annotations_.getMutableMap().put(annotations__.getKey(), annotations__.getValue());
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                namespace_ = bs;
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          containers_ = java.util.Collections.unmodifiableList(containers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetAnnotations();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.class,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder.class);
    }

    private int bitField0_;
    public static final int CONTAINERS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
        containers_;
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
        getContainersList() {
      return containers_;
    }
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>
        getContainersOrBuilderList() {
      return containers_;
    }
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    public int getContainersCount() {
      return containers_.size();
    }
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec getContainers(
        int index) {
      return containers_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Containers is a list of a subset of the information in each container of the Pod being created.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder
        getContainersOrBuilder(int index) {
      return containers_.get(index);
    }

    public static final int ANNOTATIONS_FIELD_NUMBER = 2;

    private static final class AnnotationsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1alpha1Imagepolicy
                  .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> annotations_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAnnotations() {
      if (annotations_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AnnotationsDefaultEntryHolder.defaultEntry);
      }
      return annotations_;
    }

    public int getAnnotationsCount() {
      return internalGetAnnotations().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    public boolean containsAnnotations(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetAnnotations().getMap().containsKey(key);
    }
    /** Use {@link #getAnnotationsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
      return getAnnotationsMap();
    }
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap() {
      return internalGetAnnotations().getMap();
    }
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    public java.lang.String getAnnotationsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAnnotations().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Annotations is a list of key-value pairs extracted from the Pod's annotations.
     * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
     * It is up to each webhook backend to determine how to interpret these annotations, if at all.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; annotations = 2;</code>
     */
    public java.lang.String getAnnotationsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAnnotations().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int NAMESPACE_FIELD_NUMBER = 3;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
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
     * Namespace is the namespace the pod is being created in.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 3;</code>
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
      for (int i = 0; i < containers_.size(); i++) {
        output.writeMessage(1, containers_.get(i));
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetAnnotations(), AnnotationsDefaultEntryHolder.defaultEntry, 2);
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, namespace_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < containers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, containers_.get(i));
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetAnnotations().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> annotations__ =
            AnnotationsDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, annotations__);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, namespace_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec other =
          (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec) obj;

      boolean result = true;
      result = result && getContainersList().equals(other.getContainersList());
      result = result && internalGetAnnotations().equals(other.internalGetAnnotations());
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
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
      if (getContainersCount() > 0) {
        hash = (37 * hash) + CONTAINERS_FIELD_NUMBER;
        hash = (53 * hash) + getContainersList().hashCode();
      }
      if (!internalGetAnnotations().getMap().isEmpty()) {
        hash = (37 * hash) + ANNOTATIONS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAnnotations().hashCode();
      }
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec prototype) {
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
     * ImageReviewSpec is a description of the pod creation request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec)
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 2:
            return internalGetAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 2:
            return internalGetMutableAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.class,
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getContainersFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (containersBuilder_ == null) {
          containers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          containersBuilder_.clear();
        }
        internalGetMutableAnnotations().clear();
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec build() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec buildPartial() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec result =
            new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (containersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            containers_ = java.util.Collections.unmodifiableList(containers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.containers_ = containers_;
        } else {
          result.containers_ = containersBuilder_.build();
        }
        result.annotations_ = internalGetAnnotations();
        result.annotations_.makeImmutable();
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec.getDefaultInstance())
          return this;
        if (containersBuilder_ == null) {
          if (!other.containers_.isEmpty()) {
            if (containers_.isEmpty()) {
              containers_ = other.containers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureContainersIsMutable();
              containers_.addAll(other.containers_);
            }
            onChanged();
          }
        } else {
          if (!other.containers_.isEmpty()) {
            if (containersBuilder_.isEmpty()) {
              containersBuilder_.dispose();
              containersBuilder_ = null;
              containers_ = other.containers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              containersBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getContainersFieldBuilder()
                      : null;
            } else {
              containersBuilder_.addAllMessages(other.containers_);
            }
          }
        }
        internalGetMutableAnnotations().mergeFrom(other.internalGetAnnotations());
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000004;
          namespace_ = other.namespace_;
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
          containers_ = java.util.Collections.emptyList();

      private void ensureContainersIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          containers_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>(
                  containers_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>
          containersBuilder_;

      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
          getContainersList() {
        if (containersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(containers_);
        } else {
          return containersBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public int getContainersCount() {
        if (containersBuilder_ == null) {
          return containers_.size();
        } else {
          return containersBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec getContainers(
          int index) {
        if (containersBuilder_ == null) {
          return containers_.get(index);
        } else {
          return containersBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder setContainers(
          int index,
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec value) {
        if (containersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContainersIsMutable();
          containers_.set(index, value);
          onChanged();
        } else {
          containersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder setContainers(
          int index,
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
              builderForValue) {
        if (containersBuilder_ == null) {
          ensureContainersIsMutable();
          containers_.set(index, builderForValue.build());
          onChanged();
        } else {
          containersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder addContainers(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec value) {
        if (containersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContainersIsMutable();
          containers_.add(value);
          onChanged();
        } else {
          containersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder addContainers(
          int index,
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec value) {
        if (containersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContainersIsMutable();
          containers_.add(index, value);
          onChanged();
        } else {
          containersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder addContainers(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
              builderForValue) {
        if (containersBuilder_ == null) {
          ensureContainersIsMutable();
          containers_.add(builderForValue.build());
          onChanged();
        } else {
          containersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder addContainers(
          int index,
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
              builderForValue) {
        if (containersBuilder_ == null) {
          ensureContainersIsMutable();
          containers_.add(index, builderForValue.build());
          onChanged();
        } else {
          containersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder addAllContainers(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec>
              values) {
        if (containersBuilder_ == null) {
          ensureContainersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, containers_);
          onChanged();
        } else {
          containersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder clearContainers() {
        if (containersBuilder_ == null) {
          containers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          containersBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public Builder removeContainers(int index) {
        if (containersBuilder_ == null) {
          ensureContainersIsMutable();
          containers_.remove(index);
          onChanged();
        } else {
          containersBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
          getContainersBuilder(int index) {
        return getContainersFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder
          getContainersOrBuilder(int index) {
        if (containersBuilder_ == null) {
          return containers_.get(index);
        } else {
          return containersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>
          getContainersOrBuilderList() {
        if (containersBuilder_ != null) {
          return containersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(containers_);
        }
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
          addContainersBuilder() {
        return getContainersFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder
          addContainersBuilder(int index) {
        return getContainersFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Containers is a list of a subset of the information in each container of the Pod being created.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.imagepolicy.v1alpha1.ImageReviewContainerSpec containers = 1;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder>
          getContainersBuilderList() {
        return getContainersFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>
          getContainersFieldBuilder() {
        if (containersBuilder_ == null) {
          containersBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpec.Builder,
                  io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewContainerSpecOrBuilder>(
                  containers_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          containers_ = null;
        }
        return containersBuilder_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> annotations_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetAnnotations() {
        if (annotations_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AnnotationsDefaultEntryHolder.defaultEntry);
        }
        return annotations_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableAnnotations() {
        onChanged();
        ;
        if (annotations_ == null) {
          annotations_ =
              com.google.protobuf.MapField.newMapField(AnnotationsDefaultEntryHolder.defaultEntry);
        }
        if (!annotations_.isMutable()) {
          annotations_ = annotations_.copy();
        }
        return annotations_;
      }

      public int getAnnotationsCount() {
        return internalGetAnnotations().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public boolean containsAnnotations(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetAnnotations().getMap().containsKey(key);
      }
      /** Use {@link #getAnnotationsMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return getAnnotationsMap();
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap() {
        return internalGetAnnotations().getMap();
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public java.lang.String getAnnotationsOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetAnnotations().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public java.lang.String getAnnotationsOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetAnnotations().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAnnotations() {
        internalGetMutableAnnotations().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public Builder removeAnnotations(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAnnotations().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableAnnotations() {
        return internalGetMutableAnnotations().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public Builder putAnnotations(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAnnotations().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Annotations is a list of key-value pairs extracted from the Pod's annotations.
       * It only includes keys which match the pattern `*.image-policy.k8s.io/&#42;`.
       * It is up to each webhook backend to determine how to interpret these annotations, if at all.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; annotations = 2;</code>
       */
      public Builder putAllAnnotations(java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableAnnotations().getMutableMap().putAll(values);
        return this;
      }

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
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
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
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
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000004);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace the pod is being created in.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 3;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        namespace_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewSpec)
    private static final io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec();
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ImageReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<ImageReviewSpec>() {
          @java.lang.Override
          public ImageReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ImageReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ImageReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageReviewSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ImageReviewStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Allowed indicates that all images were allowed to be run.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean hasAllowed();
    /**
     *
     *
     * <pre>
     * Allowed indicates that all images were allowed to be run.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean getAllowed();

    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    int getAuditAnnotationsCount();
    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    boolean containsAuditAnnotations(java.lang.String key);
    /** Use {@link #getAuditAnnotationsMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getAuditAnnotations();
    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap();
    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    java.lang.String getAuditAnnotationsOrDefault(
        java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    java.lang.String getAuditAnnotationsOrThrow(java.lang.String key);
  }
  /**
   *
   *
   * <pre>
   * ImageReviewStatus is the result of the review for the pod creation request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus}
   */
  public static final class ImageReviewStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus)
      ImageReviewStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ImageReviewStatus.newBuilder() to construct.
    private ImageReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ImageReviewStatus() {
      allowed_ = false;
      reason_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ImageReviewStatus(
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
            case 8:
              {
                bitField0_ |= 0x00000001;
                allowed_ = input.readBool();
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                reason_ = bs;
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  auditAnnotations_ =
                      com.google.protobuf.MapField.newMapField(
                          AuditAnnotationsDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetAuditAnnotations();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Imagepolicy
          .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.class,
              io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private boolean allowed_;
    /**
     *
     *
     * <pre>
     * Allowed indicates that all images were allowed to be run.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean hasAllowed() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Allowed indicates that all images were allowed to be run.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean getAllowed() {
      return allowed_;
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Reason should be empty unless Allowed is false in which case it
     * may contain a short description of what is wrong.  Kubernetes
     * may truncate excessively long errors when displaying to the user.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUDITANNOTATIONS_FIELD_NUMBER = 3;

    private static final class AuditAnnotationsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1alpha1Imagepolicy
                  .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_descriptor,
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
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap() {
      return internalGetAuditAnnotations().getMap();
    }
    /**
     *
     *
     * <pre>
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
     * AuditAnnotations will be added to the attributes object of the
     * admission controller request using 'AddAnnotation'.  The keys should
     * be prefix-less (i.e., the admission controller will add an
     * appropriate prefix).
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
        output.writeBool(1, allowed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output,
          internalGetAuditAnnotations(),
          AuditAnnotationsDefaultEntryHolder.defaultEntry,
          3);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, allowed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetAuditAnnotations().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> auditAnnotations__ =
            AuditAnnotationsDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, auditAnnotations__);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus other =
          (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus) obj;

      boolean result = true;
      result = result && (hasAllowed() == other.hasAllowed());
      if (hasAllowed()) {
        result = result && (getAllowed() == other.getAllowed());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && internalGetAuditAnnotations().equals(other.internalGetAuditAnnotations());
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
      if (hasAllowed()) {
        hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowed());
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (!internalGetAuditAnnotations().getMap().isEmpty()) {
        hash = (37 * hash) + AUDITANNOTATIONS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAuditAnnotations().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus prototype) {
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
     * ImageReviewStatus is the result of the review for the pod creation request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus)
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 3:
            return internalGetAuditAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 3:
            return internalGetMutableAuditAnnotations();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.class,
                io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        allowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableAuditAnnotations().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy
            .internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus build() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus buildPartial() {
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus result =
            new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.allowed_ = allowed_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reason_ = reason_;
        result.auditAnnotations_ = internalGetAuditAnnotations();
        result.auditAnnotations_.makeImmutable();
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
                .getDefaultInstance()) return this;
        if (other.hasAllowed()) {
          setAllowed(other.getAllowed());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000002;
          reason_ = other.reason_;
          onChanged();
        }
        internalGetMutableAuditAnnotations().mergeFrom(other.internalGetAuditAnnotations());
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
        io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private boolean allowed_;
      /**
       *
       *
       * <pre>
       * Allowed indicates that all images were allowed to be run.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean hasAllowed() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates that all images were allowed to be run.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean getAllowed() {
        return allowed_;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates that all images were allowed to be run.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder setAllowed(boolean value) {
        bitField0_ |= 0x00000001;
        allowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Allowed indicates that all images were allowed to be run.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder clearAllowed() {
        bitField0_ = (bitField0_ & ~0x00000001);
        allowed_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
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
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Reason should be empty unless Allowed is false in which case it
       * may contain a short description of what is wrong.  Kubernetes
       * may truncate excessively long errors when displaying to the user.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        reason_ = value;
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getAuditAnnotationsMap() {
        return internalGetAuditAnnotations().getMap();
      }
      /**
       *
       *
       * <pre>
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
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
       * AuditAnnotations will be added to the attributes object of the
       * admission controller request using 'AddAnnotation'.  The keys should
       * be prefix-less (i.e., the admission controller will add an
       * appropriate prefix).
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; auditAnnotations = 3;</code>
       */
      public Builder putAllAuditAnnotations(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableAuditAnnotations().getMutableMap().putAll(values);
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.imagepolicy.v1alpha1.ImageReviewStatus)
    private static final io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus();
    }

    public static io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ImageReviewStatus> PARSER =
        new com.google.protobuf.AbstractParser<ImageReviewStatus>() {
          @java.lang.Override
          public ImageReviewStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ImageReviewStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ImageReviewStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageReviewStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Imagepolicy.ImageReviewStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/k8s.io/api/imagepolicy/v1alpha1/genera"
          + "ted.proto\022\037k8s.io.api.imagepolicy.v1alph"
          + "a1\0324k8s.io/apimachinery/pkg/apis/meta/v1"
          + "/generated.proto\032/k8s.io/apimachinery/pk"
          + "g/runtime/generated.proto\0326k8s.io/apimac"
          + "hinery/pkg/runtime/schema/generated.prot"
          + "o\"\325\001\n\013ImageReview\022B\n\010metadata\030\001 \001(\01320.k8"
          + "s.io.apimachinery.pkg.apis.meta.v1.Objec"
          + "tMeta\022>\n\004spec\030\002 \001(\01320.k8s.io.api.imagepo"
          + "licy.v1alpha1.ImageReviewSpec\022B\n\006status\030"
          + "\003 \001(\01322.k8s.io.api.imagepolicy.v1alpha1."
          + "ImageReviewStatus\")\n\030ImageReviewContaine"
          + "rSpec\022\r\n\005image\030\001 \001(\t\"\377\001\n\017ImageReviewSpec"
          + "\022M\n\ncontainers\030\001 \003(\01329.k8s.io.api.imagep"
          + "olicy.v1alpha1.ImageReviewContainerSpec\022"
          + "V\n\013annotations\030\002 \003(\0132A.k8s.io.api.imagep"
          + "olicy.v1alpha1.ImageReviewSpec.Annotatio"
          + "nsEntry\022\021\n\tnamespace\030\003 \001(\t\0322\n\020Annotation"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\321"
          + "\001\n\021ImageReviewStatus\022\017\n\007allowed\030\001 \001(\010\022\016\n"
          + "\006reason\030\002 \001(\t\022b\n\020auditAnnotations\030\003 \003(\0132"
          + "H.k8s.io.api.imagepolicy.v1alpha1.ImageR"
          + "eviewStatus.AuditAnnotationsEntry\0327\n\025Aud"
          + "itAnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001B;\n\032io.kubernetes.client.proto"
          + "B\023V1alpha1ImagepolicyZ\010v1alpha1"
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
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewContainerSpec_descriptor,
            new java.lang.String[] {
              "Image",
            });
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor,
            new java.lang.String[] {
              "Containers", "Annotations", "Namespace",
            });
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_descriptor =
        internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewSpec_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor,
            new java.lang.String[] {
              "Allowed", "Reason", "AuditAnnotations",
            });
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_descriptor =
        internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_imagepolicy_v1alpha1_ImageReviewStatus_AuditAnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
