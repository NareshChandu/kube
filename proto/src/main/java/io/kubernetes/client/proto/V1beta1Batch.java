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

public final class V1beta1Batch {
  private V1beta1Batch() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface CronJobOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.CronJob)
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
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getStatus();
    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * CronJob represents the configuration of a single cron job.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJob}
   */
  public static final class CronJob extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.CronJob)
      CronJobOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CronJob.newBuilder() to construct.
    private CronJob(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CronJob() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CronJob(
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
                io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.PARSER,
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
                io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.PARSER,
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
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJob_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.CronJob.class,
              io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder.class);
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
    private io.kubernetes.client.proto.V1beta1Batch.CronJobSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a cron job, including the schedule.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Batch.CronJobStatus status_;
    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Current status of a cron job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance()
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.CronJob)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.CronJob other =
          (io.kubernetes.client.proto.V1beta1Batch.CronJob) obj;

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

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1beta1Batch.CronJob prototype) {
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
     * CronJob represents the configuration of a single cron job.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJob}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.CronJob)
        io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJob_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.CronJob.class,
                io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.CronJob.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJob getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.CronJob.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJob build() {
        io.kubernetes.client.proto.V1beta1Batch.CronJob result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJob buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.CronJob result =
            new io.kubernetes.client.proto.V1beta1Batch.CronJob(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.CronJob) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.CronJob) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.CronJob other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.CronJob.getDefaultInstance())
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
        io.kubernetes.client.proto.V1beta1Batch.CronJob parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.CronJob) e.getUnfinishedMessage();
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

      private io.kubernetes.client.proto.V1beta1Batch.CronJobSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec,
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1beta1Batch.CronJobSpec value) {
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
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder builderForValue) {
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
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1beta1Batch.CronJobSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.newBuilder(spec_)
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
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
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
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a cron job, including the schedule.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec,
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Batch.CronJobSpec,
                  io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Batch.CronJobStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus,
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.V1beta1Batch.CronJobStatus value) {
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
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder builderForValue) {
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
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public Builder mergeStatus(io.kubernetes.client.proto.V1beta1Batch.CronJobStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.newBuilder(status_)
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
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
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
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Current status of a cron job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.CronJobStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus,
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Batch.CronJobStatus,
                  io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.CronJob)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.CronJob)
    private static final io.kubernetes.client.proto.V1beta1Batch.CronJob DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.CronJob();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJob getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CronJob> PARSER =
        new com.google.protobuf.AbstractParser<CronJob>() {
          @java.lang.Override
          public CronJob parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CronJob(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CronJob> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CronJob> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.CronJob getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CronJobListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.CronJobList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob> getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJob getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * CronJobList is a collection of cron jobs.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobList}
   */
  public static final class CronJobList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.CronJobList)
      CronJobListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CronJobList.newBuilder() to construct.
    private CronJobList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CronJobList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CronJobList(
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
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Batch.CronJob>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Batch.CronJob.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.CronJobList.class,
              io.kubernetes.client.proto.V1beta1Batch.CronJobList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob> items_;
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJob getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of CronJobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
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
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
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
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.CronJobList other =
          (io.kubernetes.client.proto.V1beta1Batch.CronJobList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
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
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList parseFrom(
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobList prototype) {
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
     * CronJobList is a collection of cron jobs.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.CronJobList)
        io.kubernetes.client.proto.V1beta1Batch.CronJobListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.CronJobList.class,
                io.kubernetes.client.proto.V1beta1Batch.CronJobList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.CronJobList.newBuilder()
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
          getItemsFieldBuilder();
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
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.CronJobList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobList build() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobList buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobList result =
            new io.kubernetes.client.proto.V1beta1Batch.CronJobList(this);
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
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobList) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.CronJobList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.CronJobList other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.CronJobList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.CronJobList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
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
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Batch.CronJob>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJob,
              io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJob getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1beta1Batch.CronJob value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1beta1Batch.CronJob value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1beta1Batch.CronJob value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Batch.CronJob> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1beta1Batch.CronJob.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Batch.CronJob.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CronJobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1beta1.CronJob items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.CronJob,
              io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder,
              io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Batch.CronJob,
                  io.kubernetes.client.proto.V1beta1Batch.CronJob.Builder,
                  io.kubernetes.client.proto.V1beta1Batch.CronJobOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.CronJobList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.CronJobList)
    private static final io.kubernetes.client.proto.V1beta1Batch.CronJobList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.CronJobList();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CronJobList> PARSER =
        new com.google.protobuf.AbstractParser<CronJobList>() {
          @java.lang.Override
          public CronJobList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CronJobList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CronJobList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CronJobList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.CronJobList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CronJobSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.CronJobSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    boolean hasSchedule();
    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    java.lang.String getSchedule();
    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    com.google.protobuf.ByteString getScheduleBytes();

    /**
     *
     *
     * <pre>
     * Optional deadline in seconds for starting the job if it misses scheduled
     * time for any reason.  Missed jobs executions will be counted as failed ones.
     * +optional
     * </pre>
     *
     * <code>optional int64 startingDeadlineSeconds = 2;</code>
     */
    boolean hasStartingDeadlineSeconds();
    /**
     *
     *
     * <pre>
     * Optional deadline in seconds for starting the job if it misses scheduled
     * time for any reason.  Missed jobs executions will be counted as failed ones.
     * +optional
     * </pre>
     *
     * <code>optional int64 startingDeadlineSeconds = 2;</code>
     */
    long getStartingDeadlineSeconds();

    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    boolean hasConcurrencyPolicy();
    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    java.lang.String getConcurrencyPolicy();
    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    com.google.protobuf.ByteString getConcurrencyPolicyBytes();

    /**
     *
     *
     * <pre>
     * This flag tells the controller to suspend subsequent executions, it does
     * not apply to already started executions.  Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool suspend = 4;</code>
     */
    boolean hasSuspend();
    /**
     *
     *
     * <pre>
     * This flag tells the controller to suspend subsequent executions, it does
     * not apply to already started executions.  Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool suspend = 4;</code>
     */
    boolean getSuspend();

    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    boolean hasJobTemplate();
    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getJobTemplate();
    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder getJobTemplateOrBuilder();

    /**
     *
     *
     * <pre>
     * The number of successful finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 3.
     * +optional
     * </pre>
     *
     * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
     */
    boolean hasSuccessfulJobsHistoryLimit();
    /**
     *
     *
     * <pre>
     * The number of successful finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 3.
     * +optional
     * </pre>
     *
     * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
     */
    int getSuccessfulJobsHistoryLimit();

    /**
     *
     *
     * <pre>
     * The number of failed finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 1.
     * +optional
     * </pre>
     *
     * <code>optional int32 failedJobsHistoryLimit = 7;</code>
     */
    boolean hasFailedJobsHistoryLimit();
    /**
     *
     *
     * <pre>
     * The number of failed finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 1.
     * +optional
     * </pre>
     *
     * <code>optional int32 failedJobsHistoryLimit = 7;</code>
     */
    int getFailedJobsHistoryLimit();
  }
  /**
   *
   *
   * <pre>
   * CronJobSpec describes how the job execution will look like and when it will actually run.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobSpec}
   */
  public static final class CronJobSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.CronJobSpec)
      CronJobSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CronJobSpec.newBuilder() to construct.
    private CronJobSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CronJobSpec() {
      schedule_ = "";
      startingDeadlineSeconds_ = 0L;
      concurrencyPolicy_ = "";
      suspend_ = false;
      successfulJobsHistoryLimit_ = 0;
      failedJobsHistoryLimit_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CronJobSpec(
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
                schedule_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                startingDeadlineSeconds_ = input.readInt64();
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                concurrencyPolicy_ = bs;
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000008;
                suspend_ = input.readBool();
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = jobTemplate_.toBuilder();
                }
                jobTemplate_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(jobTemplate_);
                  jobTemplate_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000020;
                successfulJobsHistoryLimit_ = input.readInt32();
                break;
              }
            case 56:
              {
                bitField0_ |= 0x00000040;
                failedJobsHistoryLimit_ = input.readInt32();
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
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.class,
              io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder.class);
    }

    private int bitField0_;
    public static final int SCHEDULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object schedule_;
    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    public java.lang.String getSchedule() {
      java.lang.Object ref = schedule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          schedule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * </pre>
     *
     * <code>optional string schedule = 1;</code>
     */
    public com.google.protobuf.ByteString getScheduleBytes() {
      java.lang.Object ref = schedule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schedule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STARTINGDEADLINESECONDS_FIELD_NUMBER = 2;
    private long startingDeadlineSeconds_;
    /**
     *
     *
     * <pre>
     * Optional deadline in seconds for starting the job if it misses scheduled
     * time for any reason.  Missed jobs executions will be counted as failed ones.
     * +optional
     * </pre>
     *
     * <code>optional int64 startingDeadlineSeconds = 2;</code>
     */
    public boolean hasStartingDeadlineSeconds() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Optional deadline in seconds for starting the job if it misses scheduled
     * time for any reason.  Missed jobs executions will be counted as failed ones.
     * +optional
     * </pre>
     *
     * <code>optional int64 startingDeadlineSeconds = 2;</code>
     */
    public long getStartingDeadlineSeconds() {
      return startingDeadlineSeconds_;
    }

    public static final int CONCURRENCYPOLICY_FIELD_NUMBER = 3;
    private volatile java.lang.Object concurrencyPolicy_;
    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    public boolean hasConcurrencyPolicy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    public java.lang.String getConcurrencyPolicy() {
      java.lang.Object ref = concurrencyPolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          concurrencyPolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how to treat concurrent executions of a Job.
     * Valid values are:
     * - "Allow" (default): allows CronJobs to run concurrently;
     * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
     * - "Replace": cancels currently running job and replaces it with a new one
     * +optional
     * </pre>
     *
     * <code>optional string concurrencyPolicy = 3;</code>
     */
    public com.google.protobuf.ByteString getConcurrencyPolicyBytes() {
      java.lang.Object ref = concurrencyPolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        concurrencyPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUSPEND_FIELD_NUMBER = 4;
    private boolean suspend_;
    /**
     *
     *
     * <pre>
     * This flag tells the controller to suspend subsequent executions, it does
     * not apply to already started executions.  Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool suspend = 4;</code>
     */
    public boolean hasSuspend() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * This flag tells the controller to suspend subsequent executions, it does
     * not apply to already started executions.  Defaults to false.
     * +optional
     * </pre>
     *
     * <code>optional bool suspend = 4;</code>
     */
    public boolean getSuspend() {
      return suspend_;
    }

    public static final int JOBTEMPLATE_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec jobTemplate_;
    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    public boolean hasJobTemplate() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getJobTemplate() {
      return jobTemplate_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
          : jobTemplate_;
    }
    /**
     *
     *
     * <pre>
     * Specifies the job that will be created when executing a CronJob.
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder
        getJobTemplateOrBuilder() {
      return jobTemplate_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
          : jobTemplate_;
    }

    public static final int SUCCESSFULJOBSHISTORYLIMIT_FIELD_NUMBER = 6;
    private int successfulJobsHistoryLimit_;
    /**
     *
     *
     * <pre>
     * The number of successful finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 3.
     * +optional
     * </pre>
     *
     * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
     */
    public boolean hasSuccessfulJobsHistoryLimit() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * The number of successful finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 3.
     * +optional
     * </pre>
     *
     * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
     */
    public int getSuccessfulJobsHistoryLimit() {
      return successfulJobsHistoryLimit_;
    }

    public static final int FAILEDJOBSHISTORYLIMIT_FIELD_NUMBER = 7;
    private int failedJobsHistoryLimit_;
    /**
     *
     *
     * <pre>
     * The number of failed finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 1.
     * +optional
     * </pre>
     *
     * <code>optional int32 failedJobsHistoryLimit = 7;</code>
     */
    public boolean hasFailedJobsHistoryLimit() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * The number of failed finished jobs to retain.
     * This is a pointer to distinguish between explicit zero and not specified.
     * Defaults to 1.
     * +optional
     * </pre>
     *
     * <code>optional int32 failedJobsHistoryLimit = 7;</code>
     */
    public int getFailedJobsHistoryLimit() {
      return failedJobsHistoryLimit_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, schedule_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, startingDeadlineSeconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, concurrencyPolicy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, suspend_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getJobTemplate());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, successfulJobsHistoryLimit_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, failedJobsHistoryLimit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, schedule_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, startingDeadlineSeconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, concurrencyPolicy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, suspend_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getJobTemplate());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeInt32Size(6, successfulJobsHistoryLimit_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(7, failedJobsHistoryLimit_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.CronJobSpec other =
          (io.kubernetes.client.proto.V1beta1Batch.CronJobSpec) obj;

      boolean result = true;
      result = result && (hasSchedule() == other.hasSchedule());
      if (hasSchedule()) {
        result = result && getSchedule().equals(other.getSchedule());
      }
      result = result && (hasStartingDeadlineSeconds() == other.hasStartingDeadlineSeconds());
      if (hasStartingDeadlineSeconds()) {
        result = result && (getStartingDeadlineSeconds() == other.getStartingDeadlineSeconds());
      }
      result = result && (hasConcurrencyPolicy() == other.hasConcurrencyPolicy());
      if (hasConcurrencyPolicy()) {
        result = result && getConcurrencyPolicy().equals(other.getConcurrencyPolicy());
      }
      result = result && (hasSuspend() == other.hasSuspend());
      if (hasSuspend()) {
        result = result && (getSuspend() == other.getSuspend());
      }
      result = result && (hasJobTemplate() == other.hasJobTemplate());
      if (hasJobTemplate()) {
        result = result && getJobTemplate().equals(other.getJobTemplate());
      }
      result = result && (hasSuccessfulJobsHistoryLimit() == other.hasSuccessfulJobsHistoryLimit());
      if (hasSuccessfulJobsHistoryLimit()) {
        result =
            result && (getSuccessfulJobsHistoryLimit() == other.getSuccessfulJobsHistoryLimit());
      }
      result = result && (hasFailedJobsHistoryLimit() == other.hasFailedJobsHistoryLimit());
      if (hasFailedJobsHistoryLimit()) {
        result = result && (getFailedJobsHistoryLimit() == other.getFailedJobsHistoryLimit());
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
      if (hasSchedule()) {
        hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
        hash = (53 * hash) + getSchedule().hashCode();
      }
      if (hasStartingDeadlineSeconds()) {
        hash = (37 * hash) + STARTINGDEADLINESECONDS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getStartingDeadlineSeconds());
      }
      if (hasConcurrencyPolicy()) {
        hash = (37 * hash) + CONCURRENCYPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getConcurrencyPolicy().hashCode();
      }
      if (hasSuspend()) {
        hash = (37 * hash) + SUSPEND_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuspend());
      }
      if (hasJobTemplate()) {
        hash = (37 * hash) + JOBTEMPLATE_FIELD_NUMBER;
        hash = (53 * hash) + getJobTemplate().hashCode();
      }
      if (hasSuccessfulJobsHistoryLimit()) {
        hash = (37 * hash) + SUCCESSFULJOBSHISTORYLIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getSuccessfulJobsHistoryLimit();
      }
      if (hasFailedJobsHistoryLimit()) {
        hash = (37 * hash) + FAILEDJOBSHISTORYLIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getFailedJobsHistoryLimit();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parseFrom(
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobSpec prototype) {
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
     * CronJobSpec describes how the job execution will look like and when it will actually run.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.CronJobSpec)
        io.kubernetes.client.proto.V1beta1Batch.CronJobSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.class,
                io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getJobTemplateFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        schedule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        startingDeadlineSeconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        concurrencyPolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        suspend_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (jobTemplateBuilder_ == null) {
          jobTemplate_ = null;
        } else {
          jobTemplateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        successfulJobsHistoryLimit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        failedJobsHistoryLimit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec build() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobSpec result =
            new io.kubernetes.client.proto.V1beta1Batch.CronJobSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.schedule_ = schedule_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.startingDeadlineSeconds_ = startingDeadlineSeconds_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.concurrencyPolicy_ = concurrencyPolicy_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.suspend_ = suspend_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (jobTemplateBuilder_ == null) {
          result.jobTemplate_ = jobTemplate_;
        } else {
          result.jobTemplate_ = jobTemplateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.successfulJobsHistoryLimit_ = successfulJobsHistoryLimit_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.failedJobsHistoryLimit_ = failedJobsHistoryLimit_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.CronJobSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.CronJobSpec other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.CronJobSpec.getDefaultInstance())
          return this;
        if (other.hasSchedule()) {
          bitField0_ |= 0x00000001;
          schedule_ = other.schedule_;
          onChanged();
        }
        if (other.hasStartingDeadlineSeconds()) {
          setStartingDeadlineSeconds(other.getStartingDeadlineSeconds());
        }
        if (other.hasConcurrencyPolicy()) {
          bitField0_ |= 0x00000004;
          concurrencyPolicy_ = other.concurrencyPolicy_;
          onChanged();
        }
        if (other.hasSuspend()) {
          setSuspend(other.getSuspend());
        }
        if (other.hasJobTemplate()) {
          mergeJobTemplate(other.getJobTemplate());
        }
        if (other.hasSuccessfulJobsHistoryLimit()) {
          setSuccessfulJobsHistoryLimit(other.getSuccessfulJobsHistoryLimit());
        }
        if (other.hasFailedJobsHistoryLimit()) {
          setFailedJobsHistoryLimit(other.getFailedJobsHistoryLimit());
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.CronJobSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object schedule_ = "";
      /**
       *
       *
       * <pre>
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public boolean hasSchedule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public java.lang.String getSchedule() {
        java.lang.Object ref = schedule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            schedule_ = s;
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
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public com.google.protobuf.ByteString getScheduleBytes() {
        java.lang.Object ref = schedule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          schedule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public Builder setSchedule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        schedule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public Builder clearSchedule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        schedule_ = getDefaultInstance().getSchedule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
       * </pre>
       *
       * <code>optional string schedule = 1;</code>
       */
      public Builder setScheduleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        schedule_ = value;
        onChanged();
        return this;
      }

      private long startingDeadlineSeconds_;
      /**
       *
       *
       * <pre>
       * Optional deadline in seconds for starting the job if it misses scheduled
       * time for any reason.  Missed jobs executions will be counted as failed ones.
       * +optional
       * </pre>
       *
       * <code>optional int64 startingDeadlineSeconds = 2;</code>
       */
      public boolean hasStartingDeadlineSeconds() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Optional deadline in seconds for starting the job if it misses scheduled
       * time for any reason.  Missed jobs executions will be counted as failed ones.
       * +optional
       * </pre>
       *
       * <code>optional int64 startingDeadlineSeconds = 2;</code>
       */
      public long getStartingDeadlineSeconds() {
        return startingDeadlineSeconds_;
      }
      /**
       *
       *
       * <pre>
       * Optional deadline in seconds for starting the job if it misses scheduled
       * time for any reason.  Missed jobs executions will be counted as failed ones.
       * +optional
       * </pre>
       *
       * <code>optional int64 startingDeadlineSeconds = 2;</code>
       */
      public Builder setStartingDeadlineSeconds(long value) {
        bitField0_ |= 0x00000002;
        startingDeadlineSeconds_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Optional deadline in seconds for starting the job if it misses scheduled
       * time for any reason.  Missed jobs executions will be counted as failed ones.
       * +optional
       * </pre>
       *
       * <code>optional int64 startingDeadlineSeconds = 2;</code>
       */
      public Builder clearStartingDeadlineSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        startingDeadlineSeconds_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object concurrencyPolicy_ = "";
      /**
       *
       *
       * <pre>
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public boolean hasConcurrencyPolicy() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public java.lang.String getConcurrencyPolicy() {
        java.lang.Object ref = concurrencyPolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            concurrencyPolicy_ = s;
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
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public com.google.protobuf.ByteString getConcurrencyPolicyBytes() {
        java.lang.Object ref = concurrencyPolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          concurrencyPolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public Builder setConcurrencyPolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        concurrencyPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public Builder clearConcurrencyPolicy() {
        bitField0_ = (bitField0_ & ~0x00000004);
        concurrencyPolicy_ = getDefaultInstance().getConcurrencyPolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies how to treat concurrent executions of a Job.
       * Valid values are:
       * - "Allow" (default): allows CronJobs to run concurrently;
       * - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet;
       * - "Replace": cancels currently running job and replaces it with a new one
       * +optional
       * </pre>
       *
       * <code>optional string concurrencyPolicy = 3;</code>
       */
      public Builder setConcurrencyPolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        concurrencyPolicy_ = value;
        onChanged();
        return this;
      }

      private boolean suspend_;
      /**
       *
       *
       * <pre>
       * This flag tells the controller to suspend subsequent executions, it does
       * not apply to already started executions.  Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool suspend = 4;</code>
       */
      public boolean hasSuspend() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * This flag tells the controller to suspend subsequent executions, it does
       * not apply to already started executions.  Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool suspend = 4;</code>
       */
      public boolean getSuspend() {
        return suspend_;
      }
      /**
       *
       *
       * <pre>
       * This flag tells the controller to suspend subsequent executions, it does
       * not apply to already started executions.  Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool suspend = 4;</code>
       */
      public Builder setSuspend(boolean value) {
        bitField0_ |= 0x00000008;
        suspend_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * This flag tells the controller to suspend subsequent executions, it does
       * not apply to already started executions.  Defaults to false.
       * +optional
       * </pre>
       *
       * <code>optional bool suspend = 4;</code>
       */
      public Builder clearSuspend() {
        bitField0_ = (bitField0_ & ~0x00000008);
        suspend_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec jobTemplate_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>
          jobTemplateBuilder_;
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public boolean hasJobTemplate() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getJobTemplate() {
        if (jobTemplateBuilder_ == null) {
          return jobTemplate_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
              : jobTemplate_;
        } else {
          return jobTemplateBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public Builder setJobTemplate(io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec value) {
        if (jobTemplateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jobTemplate_ = value;
          onChanged();
        } else {
          jobTemplateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public Builder setJobTemplate(
          io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder builderForValue) {
        if (jobTemplateBuilder_ == null) {
          jobTemplate_ = builderForValue.build();
          onChanged();
        } else {
          jobTemplateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public Builder mergeJobTemplate(
          io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec value) {
        if (jobTemplateBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && jobTemplate_ != null
              && jobTemplate_
                  != io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()) {
            jobTemplate_ =
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.newBuilder(jobTemplate_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            jobTemplate_ = value;
          }
          onChanged();
        } else {
          jobTemplateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public Builder clearJobTemplate() {
        if (jobTemplateBuilder_ == null) {
          jobTemplate_ = null;
          onChanged();
        } else {
          jobTemplateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder
          getJobTemplateBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getJobTemplateFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder
          getJobTemplateOrBuilder() {
        if (jobTemplateBuilder_ != null) {
          return jobTemplateBuilder_.getMessageOrBuilder();
        } else {
          return jobTemplate_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
              : jobTemplate_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specifies the job that will be created when executing a CronJob.
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec jobTemplate = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>
          getJobTemplateFieldBuilder() {
        if (jobTemplateBuilder_ == null) {
          jobTemplateBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>(
                  getJobTemplate(), getParentForChildren(), isClean());
          jobTemplate_ = null;
        }
        return jobTemplateBuilder_;
      }

      private int successfulJobsHistoryLimit_;
      /**
       *
       *
       * <pre>
       * The number of successful finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 3.
       * +optional
       * </pre>
       *
       * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
       */
      public boolean hasSuccessfulJobsHistoryLimit() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * The number of successful finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 3.
       * +optional
       * </pre>
       *
       * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
       */
      public int getSuccessfulJobsHistoryLimit() {
        return successfulJobsHistoryLimit_;
      }
      /**
       *
       *
       * <pre>
       * The number of successful finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 3.
       * +optional
       * </pre>
       *
       * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
       */
      public Builder setSuccessfulJobsHistoryLimit(int value) {
        bitField0_ |= 0x00000020;
        successfulJobsHistoryLimit_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The number of successful finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 3.
       * +optional
       * </pre>
       *
       * <code>optional int32 successfulJobsHistoryLimit = 6;</code>
       */
      public Builder clearSuccessfulJobsHistoryLimit() {
        bitField0_ = (bitField0_ & ~0x00000020);
        successfulJobsHistoryLimit_ = 0;
        onChanged();
        return this;
      }

      private int failedJobsHistoryLimit_;
      /**
       *
       *
       * <pre>
       * The number of failed finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 1.
       * +optional
       * </pre>
       *
       * <code>optional int32 failedJobsHistoryLimit = 7;</code>
       */
      public boolean hasFailedJobsHistoryLimit() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * The number of failed finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 1.
       * +optional
       * </pre>
       *
       * <code>optional int32 failedJobsHistoryLimit = 7;</code>
       */
      public int getFailedJobsHistoryLimit() {
        return failedJobsHistoryLimit_;
      }
      /**
       *
       *
       * <pre>
       * The number of failed finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 1.
       * +optional
       * </pre>
       *
       * <code>optional int32 failedJobsHistoryLimit = 7;</code>
       */
      public Builder setFailedJobsHistoryLimit(int value) {
        bitField0_ |= 0x00000040;
        failedJobsHistoryLimit_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The number of failed finished jobs to retain.
       * This is a pointer to distinguish between explicit zero and not specified.
       * Defaults to 1.
       * +optional
       * </pre>
       *
       * <code>optional int32 failedJobsHistoryLimit = 7;</code>
       */
      public Builder clearFailedJobsHistoryLimit() {
        bitField0_ = (bitField0_ & ~0x00000040);
        failedJobsHistoryLimit_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.CronJobSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.CronJobSpec)
    private static final io.kubernetes.client.proto.V1beta1Batch.CronJobSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.CronJobSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CronJobSpec> PARSER =
        new com.google.protobuf.AbstractParser<CronJobSpec>() {
          @java.lang.Override
          public CronJobSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CronJobSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CronJobSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CronJobSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.CronJobSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CronJobStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.CronJobStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.ObjectReference> getActiveList();
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    io.kubernetes.client.proto.V1.ObjectReference getActive(int index);
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    int getActiveCount();
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>
        getActiveOrBuilderList();
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder getActiveOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    boolean hasLastScheduleTime();
    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastScheduleTime();
    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScheduleTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    boolean hasLastSuccessfulTime();
    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastSuccessfulTime();
    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastSuccessfulTimeOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * CronJobStatus represents the current state of a cron job.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobStatus}
   */
  public static final class CronJobStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.CronJobStatus)
      CronJobStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CronJobStatus.newBuilder() to construct.
    private CronJobStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CronJobStatus() {
      active_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CronJobStatus(
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
                  active_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1.ObjectReference>();
                  mutable_bitField0_ |= 0x00000001;
                }
                active_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.ObjectReference.PARSER, extensionRegistry));
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = lastScheduleTime_.toBuilder();
                }
                lastScheduleTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastScheduleTime_);
                  lastScheduleTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = lastSuccessfulTime_.toBuilder();
                }
                lastSuccessfulTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastSuccessfulTime_);
                  lastSuccessfulTime_ = subBuilder.buildPartial();
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          active_ = java.util.Collections.unmodifiableList(active_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.class,
              io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ACTIVE_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1.ObjectReference> active_;
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.ObjectReference> getActiveList() {
      return active_;
    }
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>
        getActiveOrBuilderList() {
      return active_;
    }
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    public int getActiveCount() {
      return active_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    public io.kubernetes.client.proto.V1.ObjectReference getActive(int index) {
      return active_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of pointers to currently running jobs.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
     */
    public io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder getActiveOrBuilder(int index) {
      return active_.get(index);
    }

    public static final int LASTSCHEDULETIME_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.Time lastScheduleTime_;
    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    public boolean hasLastScheduleTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastScheduleTime() {
      return lastScheduleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScheduleTime_;
    }
    /**
     *
     *
     * <pre>
     * Information when was the last time the job was successfully scheduled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScheduleTimeOrBuilder() {
      return lastScheduleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScheduleTime_;
    }

    public static final int LASTSUCCESSFULTIME_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.Meta.Time lastSuccessfulTime_;
    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    public boolean hasLastSuccessfulTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastSuccessfulTime() {
      return lastSuccessfulTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastSuccessfulTime_;
    }
    /**
     *
     *
     * <pre>
     * Information when was the last time the job successfully completed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastSuccessfulTimeOrBuilder() {
      return lastSuccessfulTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastSuccessfulTime_;
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
      for (int i = 0; i < active_.size(); i++) {
        output.writeMessage(1, active_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(4, getLastScheduleTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(5, getLastSuccessfulTime());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < active_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, active_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getLastScheduleTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(5, getLastSuccessfulTime());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.CronJobStatus other =
          (io.kubernetes.client.proto.V1beta1Batch.CronJobStatus) obj;

      boolean result = true;
      result = result && getActiveList().equals(other.getActiveList());
      result = result && (hasLastScheduleTime() == other.hasLastScheduleTime());
      if (hasLastScheduleTime()) {
        result = result && getLastScheduleTime().equals(other.getLastScheduleTime());
      }
      result = result && (hasLastSuccessfulTime() == other.hasLastSuccessfulTime());
      if (hasLastSuccessfulTime()) {
        result = result && getLastSuccessfulTime().equals(other.getLastSuccessfulTime());
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
      if (getActiveCount() > 0) {
        hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
        hash = (53 * hash) + getActiveList().hashCode();
      }
      if (hasLastScheduleTime()) {
        hash = (37 * hash) + LASTSCHEDULETIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastScheduleTime().hashCode();
      }
      if (hasLastSuccessfulTime()) {
        hash = (37 * hash) + LASTSUCCESSFULTIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastSuccessfulTime().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parseFrom(
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobStatus prototype) {
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
     * CronJobStatus represents the current state of a cron job.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.CronJobStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.CronJobStatus)
        io.kubernetes.client.proto.V1beta1Batch.CronJobStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.class,
                io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getActiveFieldBuilder();
          getLastScheduleTimeFieldBuilder();
          getLastSuccessfulTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (activeBuilder_ == null) {
          active_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          activeBuilder_.clear();
        }
        if (lastScheduleTimeBuilder_ == null) {
          lastScheduleTime_ = null;
        } else {
          lastScheduleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (lastSuccessfulTimeBuilder_ == null) {
          lastSuccessfulTime_ = null;
        } else {
          lastSuccessfulTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus build() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.CronJobStatus result =
            new io.kubernetes.client.proto.V1beta1Batch.CronJobStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (activeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            active_ = java.util.Collections.unmodifiableList(active_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.active_ = active_;
        } else {
          result.active_ = activeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        if (lastScheduleTimeBuilder_ == null) {
          result.lastScheduleTime_ = lastScheduleTime_;
        } else {
          result.lastScheduleTime_ = lastScheduleTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (lastSuccessfulTimeBuilder_ == null) {
          result.lastSuccessfulTime_ = lastSuccessfulTime_;
        } else {
          result.lastSuccessfulTime_ = lastSuccessfulTimeBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.CronJobStatus) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.CronJobStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.CronJobStatus other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.CronJobStatus.getDefaultInstance())
          return this;
        if (activeBuilder_ == null) {
          if (!other.active_.isEmpty()) {
            if (active_.isEmpty()) {
              active_ = other.active_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureActiveIsMutable();
              active_.addAll(other.active_);
            }
            onChanged();
          }
        } else {
          if (!other.active_.isEmpty()) {
            if (activeBuilder_.isEmpty()) {
              activeBuilder_.dispose();
              activeBuilder_ = null;
              active_ = other.active_;
              bitField0_ = (bitField0_ & ~0x00000001);
              activeBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getActiveFieldBuilder()
                      : null;
            } else {
              activeBuilder_.addAllMessages(other.active_);
            }
          }
        }
        if (other.hasLastScheduleTime()) {
          mergeLastScheduleTime(other.getLastScheduleTime());
        }
        if (other.hasLastSuccessfulTime()) {
          mergeLastSuccessfulTime(other.getLastSuccessfulTime());
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
        io.kubernetes.client.proto.V1beta1Batch.CronJobStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.CronJobStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<io.kubernetes.client.proto.V1.ObjectReference> active_ =
          java.util.Collections.emptyList();

      private void ensureActiveIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          active_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.ObjectReference>(active_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.ObjectReference,
              io.kubernetes.client.proto.V1.ObjectReference.Builder,
              io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>
          activeBuilder_;

      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.ObjectReference> getActiveList() {
        if (activeBuilder_ == null) {
          return java.util.Collections.unmodifiableList(active_);
        } else {
          return activeBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public int getActiveCount() {
        if (activeBuilder_ == null) {
          return active_.size();
        } else {
          return activeBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public io.kubernetes.client.proto.V1.ObjectReference getActive(int index) {
        if (activeBuilder_ == null) {
          return active_.get(index);
        } else {
          return activeBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder setActive(int index, io.kubernetes.client.proto.V1.ObjectReference value) {
        if (activeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActiveIsMutable();
          active_.set(index, value);
          onChanged();
        } else {
          activeBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder setActive(
          int index, io.kubernetes.client.proto.V1.ObjectReference.Builder builderForValue) {
        if (activeBuilder_ == null) {
          ensureActiveIsMutable();
          active_.set(index, builderForValue.build());
          onChanged();
        } else {
          activeBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder addActive(io.kubernetes.client.proto.V1.ObjectReference value) {
        if (activeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActiveIsMutable();
          active_.add(value);
          onChanged();
        } else {
          activeBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder addActive(int index, io.kubernetes.client.proto.V1.ObjectReference value) {
        if (activeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActiveIsMutable();
          active_.add(index, value);
          onChanged();
        } else {
          activeBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder addActive(
          io.kubernetes.client.proto.V1.ObjectReference.Builder builderForValue) {
        if (activeBuilder_ == null) {
          ensureActiveIsMutable();
          active_.add(builderForValue.build());
          onChanged();
        } else {
          activeBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder addActive(
          int index, io.kubernetes.client.proto.V1.ObjectReference.Builder builderForValue) {
        if (activeBuilder_ == null) {
          ensureActiveIsMutable();
          active_.add(index, builderForValue.build());
          onChanged();
        } else {
          activeBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder addAllActive(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.ObjectReference> values) {
        if (activeBuilder_ == null) {
          ensureActiveIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, active_);
          onChanged();
        } else {
          activeBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder clearActive() {
        if (activeBuilder_ == null) {
          active_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          activeBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public Builder removeActive(int index) {
        if (activeBuilder_ == null) {
          ensureActiveIsMutable();
          active_.remove(index);
          onChanged();
        } else {
          activeBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public io.kubernetes.client.proto.V1.ObjectReference.Builder getActiveBuilder(int index) {
        return getActiveFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder getActiveOrBuilder(int index) {
        if (activeBuilder_ == null) {
          return active_.get(index);
        } else {
          return activeBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>
          getActiveOrBuilderList() {
        if (activeBuilder_ != null) {
          return activeBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(active_);
        }
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public io.kubernetes.client.proto.V1.ObjectReference.Builder addActiveBuilder() {
        return getActiveFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.ObjectReference.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public io.kubernetes.client.proto.V1.ObjectReference.Builder addActiveBuilder(int index) {
        return getActiveFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1.ObjectReference.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * A list of pointers to currently running jobs.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.ObjectReference active = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.ObjectReference.Builder>
          getActiveBuilderList() {
        return getActiveFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.ObjectReference,
              io.kubernetes.client.proto.V1.ObjectReference.Builder,
              io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>
          getActiveFieldBuilder() {
        if (activeBuilder_ == null) {
          activeBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.ObjectReference,
                  io.kubernetes.client.proto.V1.ObjectReference.Builder,
                  io.kubernetes.client.proto.V1.ObjectReferenceOrBuilder>(
                  active_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          active_ = null;
        }
        return activeBuilder_;
      }

      private io.kubernetes.client.proto.Meta.Time lastScheduleTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastScheduleTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public boolean hasLastScheduleTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastScheduleTime() {
        if (lastScheduleTimeBuilder_ == null) {
          return lastScheduleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScheduleTime_;
        } else {
          return lastScheduleTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public Builder setLastScheduleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScheduleTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastScheduleTime_ = value;
          onChanged();
        } else {
          lastScheduleTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public Builder setLastScheduleTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastScheduleTimeBuilder_ == null) {
          lastScheduleTime_ = builderForValue.build();
          onChanged();
        } else {
          lastScheduleTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public Builder mergeLastScheduleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScheduleTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && lastScheduleTime_ != null
              && lastScheduleTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastScheduleTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastScheduleTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastScheduleTime_ = value;
          }
          onChanged();
        } else {
          lastScheduleTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public Builder clearLastScheduleTime() {
        if (lastScheduleTimeBuilder_ == null) {
          lastScheduleTime_ = null;
          onChanged();
        } else {
          lastScheduleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastScheduleTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLastScheduleTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScheduleTimeOrBuilder() {
        if (lastScheduleTimeBuilder_ != null) {
          return lastScheduleTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastScheduleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScheduleTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job was successfully scheduled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScheduleTime = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastScheduleTimeFieldBuilder() {
        if (lastScheduleTimeBuilder_ == null) {
          lastScheduleTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastScheduleTime(), getParentForChildren(), isClean());
          lastScheduleTime_ = null;
        }
        return lastScheduleTimeBuilder_;
      }

      private io.kubernetes.client.proto.Meta.Time lastSuccessfulTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastSuccessfulTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public boolean hasLastSuccessfulTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastSuccessfulTime() {
        if (lastSuccessfulTimeBuilder_ == null) {
          return lastSuccessfulTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastSuccessfulTime_;
        } else {
          return lastSuccessfulTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public Builder setLastSuccessfulTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastSuccessfulTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastSuccessfulTime_ = value;
          onChanged();
        } else {
          lastSuccessfulTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public Builder setLastSuccessfulTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastSuccessfulTimeBuilder_ == null) {
          lastSuccessfulTime_ = builderForValue.build();
          onChanged();
        } else {
          lastSuccessfulTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public Builder mergeLastSuccessfulTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastSuccessfulTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && lastSuccessfulTime_ != null
              && lastSuccessfulTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastSuccessfulTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastSuccessfulTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastSuccessfulTime_ = value;
          }
          onChanged();
        } else {
          lastSuccessfulTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public Builder clearLastSuccessfulTime() {
        if (lastSuccessfulTimeBuilder_ == null) {
          lastSuccessfulTime_ = null;
          onChanged();
        } else {
          lastSuccessfulTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastSuccessfulTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLastSuccessfulTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastSuccessfulTimeOrBuilder() {
        if (lastSuccessfulTimeBuilder_ != null) {
          return lastSuccessfulTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastSuccessfulTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastSuccessfulTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Information when was the last time the job successfully completed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastSuccessfulTime = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastSuccessfulTimeFieldBuilder() {
        if (lastSuccessfulTimeBuilder_ == null) {
          lastSuccessfulTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastSuccessfulTime(), getParentForChildren(), isClean());
          lastSuccessfulTime_ = null;
        }
        return lastSuccessfulTimeBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.CronJobStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.CronJobStatus)
    private static final io.kubernetes.client.proto.V1beta1Batch.CronJobStatus DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.CronJobStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CronJobStatus> PARSER =
        new com.google.protobuf.AbstractParser<CronJobStatus>() {
          @java.lang.Override
          public CronJobStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CronJobStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CronJobStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CronJobStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.CronJobStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobTemplateOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.JobTemplate)
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
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    boolean hasTemplate();
    /**
     *
     *
     * <pre>
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getTemplate();
    /**
     *
     *
     * <pre>
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder getTemplateOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * JobTemplate describes a template for creating copies of a predefined pod.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.JobTemplate}
   */
  public static final class JobTemplate extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.JobTemplate)
      JobTemplateOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobTemplate.newBuilder() to construct.
    private JobTemplate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobTemplate() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobTemplate(
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
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = template_.toBuilder();
                }
                template_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(template_);
                  template_ = subBuilder.buildPartial();
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
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_JobTemplate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.JobTemplate.class,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplate.Builder.class);
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

    public static final int TEMPLATE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec template_;
    /**
     *
     *
     * <pre>
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    public boolean hasTemplate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getTemplate() {
      return template_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
          : template_;
    }
    /**
     *
     *
     * <pre>
     * Defines jobs that will be created from this template.
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder getTemplateOrBuilder() {
      return template_ == null
          ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
          : template_;
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
        output.writeMessage(2, getTemplate());
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
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTemplate());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.JobTemplate)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.JobTemplate other =
          (io.kubernetes.client.proto.V1beta1Batch.JobTemplate) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasTemplate() == other.hasTemplate());
      if (hasTemplate()) {
        result = result && getTemplate().equals(other.getTemplate());
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
      if (hasTemplate()) {
        hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
        hash = (53 * hash) + getTemplate().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate parseFrom(
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
        io.kubernetes.client.proto.V1beta1Batch.JobTemplate prototype) {
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
     * JobTemplate describes a template for creating copies of a predefined pod.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.JobTemplate}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.JobTemplate)
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.JobTemplate.class,
                io.kubernetes.client.proto.V1beta1Batch.JobTemplate.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.JobTemplate.newBuilder()
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
          getTemplateFieldBuilder();
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
        if (templateBuilder_ == null) {
          template_ = null;
        } else {
          templateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplate getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.JobTemplate.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplate build() {
        io.kubernetes.client.proto.V1beta1Batch.JobTemplate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplate buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.JobTemplate result =
            new io.kubernetes.client.proto.V1beta1Batch.JobTemplate(this);
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
        if (templateBuilder_ == null) {
          result.template_ = template_;
        } else {
          result.template_ = templateBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.JobTemplate) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.JobTemplate) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.JobTemplate other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.JobTemplate.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasTemplate()) {
          mergeTemplate(other.getTemplate());
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
        io.kubernetes.client.proto.V1beta1Batch.JobTemplate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.JobTemplate) e.getUnfinishedMessage();
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

      private io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec template_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>
          templateBuilder_;
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public boolean hasTemplate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getTemplate() {
        if (templateBuilder_ == null) {
          return template_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
              : template_;
        } else {
          return templateBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public Builder setTemplate(io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec value) {
        if (templateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          template_ = value;
          onChanged();
        } else {
          templateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public Builder setTemplate(
          io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder builderForValue) {
        if (templateBuilder_ == null) {
          template_ = builderForValue.build();
          onChanged();
        } else {
          templateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public Builder mergeTemplate(io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec value) {
        if (templateBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && template_ != null
              && template_
                  != io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()) {
            template_ =
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.newBuilder(template_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            template_ = value;
          }
          onChanged();
        } else {
          templateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public Builder clearTemplate() {
        if (templateBuilder_ == null) {
          template_ = null;
          onChanged();
        } else {
          templateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder getTemplateBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTemplateFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder
          getTemplateOrBuilder() {
        if (templateBuilder_ != null) {
          return templateBuilder_.getMessageOrBuilder();
        } else {
          return template_ == null
              ? io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance()
              : template_;
        }
      }
      /**
       *
       *
       * <pre>
       * Defines jobs that will be created from this template.
       * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1beta1.JobTemplateSpec template = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>
          getTemplateFieldBuilder() {
        if (templateBuilder_ == null) {
          templateBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec,
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder>(
                  getTemplate(), getParentForChildren(), isClean());
          template_ = null;
        }
        return templateBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.JobTemplate)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.JobTemplate)
    private static final io.kubernetes.client.proto.V1beta1Batch.JobTemplate DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.JobTemplate();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobTemplate> PARSER =
        new com.google.protobuf.AbstractParser<JobTemplate>() {
          @java.lang.Override
          public JobTemplate parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobTemplate(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobTemplate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobTemplate> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobTemplateSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1beta1.JobTemplateSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata of the jobs created from this template.
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
     * Standard object's metadata of the jobs created from this template.
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
     * Standard object's metadata of the jobs created from this template.
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
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * JobTemplateSpec describes the data a Job should have when created from a template
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1beta1.JobTemplateSpec}
   */
  public static final class JobTemplateSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1beta1.JobTemplateSpec)
      JobTemplateSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobTemplateSpec.newBuilder() to construct.
    private JobTemplateSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobTemplateSpec() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobTemplateSpec(
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
                io.kubernetes.client.proto.V1Batch.JobSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Batch.JobSpec.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
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
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Batch
          .internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.class,
              io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata of the jobs created from this template.
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
     * Standard object's metadata of the jobs created from this template.
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
     * Standard object's metadata of the jobs created from this template.
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
    private io.kubernetes.client.proto.V1Batch.JobSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the job.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
          : spec_;
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec other =
          (io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parseFrom(
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
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec prototype) {
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
     * JobTemplateSpec describes the data a Job should have when created from a template
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1beta1.JobTemplateSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1beta1.JobTemplateSpec)
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.class,
                io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Batch
            .internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec build() {
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec buildPartial() {
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec result =
            new io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec other) {
        if (other == io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
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
        io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec) e.getUnfinishedMessage();
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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
       * Standard object's metadata of the jobs created from this template.
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

      private io.kubernetes.client.proto.V1Batch.JobSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobSpec,
              io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
              io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Batch.JobSpec value) {
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
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Batch.JobSpec.Builder builderForValue) {
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
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Batch.JobSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_ != io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Batch.JobSpec.newBuilder(spec_)
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
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
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
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the job.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobSpec,
              io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
              io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Batch.JobSpec,
                  io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
                  io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1beta1.JobTemplateSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1beta1.JobTemplateSpec)
    private static final io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobTemplateSpec> PARSER =
        new com.google.protobuf.AbstractParser<JobTemplateSpec>() {
          @java.lang.Override
          public JobTemplateSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobTemplateSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobTemplateSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobTemplateSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Batch.JobTemplateSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_CronJob_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_CronJobList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_JobTemplate_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(k8s.io/api/batch/v1beta1/generated.pro"
          + "to\022\030k8s.io.api.batch.v1beta1\032#k8s.io/api"
          + "/batch/v1/generated.proto\032\"k8s.io/api/co"
          + "re/v1/generated.proto\0324k8s.io/apimachine"
          + "ry/pkg/apis/meta/v1/generated.proto\032/k8s"
          + ".io/apimachinery/pkg/runtime/generated.p"
          + "roto\0326k8s.io/apimachinery/pkg/runtime/sc"
          + "hema/generated.proto\"\273\001\n\007CronJob\022B\n\010meta"
          + "data\030\001 \001(\01320.k8s.io.apimachinery.pkg.api"
          + "s.meta.v1.ObjectMeta\0223\n\004spec\030\002 \001(\0132%.k8s"
          + ".io.api.batch.v1beta1.CronJobSpec\0227\n\006sta"
          + "tus\030\003 \001(\0132\'.k8s.io.api.batch.v1beta1.Cro"
          + "nJobStatus\"\201\001\n\013CronJobList\022@\n\010metadata\030\001"
          + " \001(\0132..k8s.io.apimachinery.pkg.apis.meta"
          + ".v1.ListMeta\0220\n\005items\030\002 \003(\0132!.k8s.io.api"
          + ".batch.v1beta1.CronJob\"\360\001\n\013CronJobSpec\022\020"
          + "\n\010schedule\030\001 \001(\t\022\037\n\027startingDeadlineSeco"
          + "nds\030\002 \001(\003\022\031\n\021concurrencyPolicy\030\003 \001(\t\022\017\n\007"
          + "suspend\030\004 \001(\010\022>\n\013jobTemplate\030\005 \001(\0132).k8s"
          + ".io.api.batch.v1beta1.JobTemplateSpec\022\"\n"
          + "\032successfulJobsHistoryLimit\030\006 \001(\005\022\036\n\026fai"
          + "ledJobsHistoryLimit\030\007 \001(\005\"\322\001\n\rCronJobSta"
          + "tus\0223\n\006active\030\001 \003(\0132#.k8s.io.api.core.v1"
          + ".ObjectReference\022D\n\020lastScheduleTime\030\004 \001"
          + "(\0132*.k8s.io.apimachinery.pkg.apis.meta.v"
          + "1.Time\022F\n\022lastSuccessfulTime\030\005 \001(\0132*.k8s"
          + ".io.apimachinery.pkg.apis.meta.v1.Time\"\216"
          + "\001\n\013JobTemplate\022B\n\010metadata\030\001 \001(\01320.k8s.i"
          + "o.apimachinery.pkg.apis.meta.v1.ObjectMe"
          + "ta\022;\n\010template\030\002 \001(\0132).k8s.io.api.batch."
          + "v1beta1.JobTemplateSpec\"\201\001\n\017JobTemplateS"
          + "pec\022B\n\010metadata\030\001 \001(\01320.k8s.io.apimachin"
          + "ery.pkg.apis.meta.v1.ObjectMeta\022*\n\004spec\030"
          + "\002 \001(\0132\034.k8s.io.api.batch.v1.JobSpecB3\n\032i"
          + "o.kubernetes.client.protoB\014V1beta1BatchZ"
          + "\007v1beta1"
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
          io.kubernetes.client.proto.V1Batch.getDescriptor(),
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_batch_v1beta1_CronJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_CronJob_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_batch_v1beta1_CronJobList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_CronJobList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_CronJobSpec_descriptor,
            new java.lang.String[] {
              "Schedule",
              "StartingDeadlineSeconds",
              "ConcurrencyPolicy",
              "Suspend",
              "JobTemplate",
              "SuccessfulJobsHistoryLimit",
              "FailedJobsHistoryLimit",
            });
    internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_CronJobStatus_descriptor,
            new java.lang.String[] {
              "Active", "LastScheduleTime", "LastSuccessfulTime",
            });
    internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_batch_v1beta1_JobTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_JobTemplate_descriptor,
            new java.lang.String[] {
              "Metadata", "Template",
            });
    internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1beta1_JobTemplateSpec_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    io.kubernetes.client.proto.V1Batch.getDescriptor();
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
