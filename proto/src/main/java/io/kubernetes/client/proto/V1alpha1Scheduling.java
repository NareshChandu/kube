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

public final class V1alpha1Scheduling {
  private V1alpha1Scheduling() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface PriorityClassOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.scheduling.v1alpha1.PriorityClass)
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
     * The value of this priority class. This is the actual priority that pods
     * receive when they have the name of this class in their pod spec.
     * </pre>
     *
     * <code>optional int32 value = 2;</code>
     */
    boolean hasValue();
    /**
     *
     *
     * <pre>
     * The value of this priority class. This is the actual priority that pods
     * receive when they have the name of this class in their pod spec.
     * </pre>
     *
     * <code>optional int32 value = 2;</code>
     */
    int getValue();

    /**
     *
     *
     * <pre>
     * globalDefault specifies whether this PriorityClass should be considered as
     * the default priority for pods that do not have any priority class.
     * Only one PriorityClass can be marked as `globalDefault`. However, if more than
     * one PriorityClasses exists with their `globalDefault` field set to true,
     * the smallest value of such global default PriorityClasses will be used as the default priority.
     * +optional
     * </pre>
     *
     * <code>optional bool globalDefault = 3;</code>
     */
    boolean hasGlobalDefault();
    /**
     *
     *
     * <pre>
     * globalDefault specifies whether this PriorityClass should be considered as
     * the default priority for pods that do not have any priority class.
     * Only one PriorityClass can be marked as `globalDefault`. However, if more than
     * one PriorityClasses exists with their `globalDefault` field set to true,
     * the smallest value of such global default PriorityClasses will be used as the default priority.
     * +optional
     * </pre>
     *
     * <code>optional bool globalDefault = 3;</code>
     */
    boolean getGlobalDefault();

    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    boolean hasDescription();
    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    java.lang.String getDescription();
    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    com.google.protobuf.ByteString getDescriptionBytes();

    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    boolean hasPreemptionPolicy();
    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    java.lang.String getPreemptionPolicy();
    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    com.google.protobuf.ByteString getPreemptionPolicyBytes();
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass.
   * PriorityClass defines mapping from a priority class name to the priority
   * integer value. The value can be any valid integer.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.scheduling.v1alpha1.PriorityClass}
   */
  public static final class PriorityClass extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.scheduling.v1alpha1.PriorityClass)
      PriorityClassOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PriorityClass.newBuilder() to construct.
    private PriorityClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PriorityClass() {
      value_ = 0;
      globalDefault_ = false;
      description_ = "";
      preemptionPolicy_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PriorityClass(
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
            case 16:
              {
                bitField0_ |= 0x00000002;
                value_ = input.readInt32();
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                globalDefault_ = input.readBool();
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                description_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                preemptionPolicy_ = bs;
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
      return io.kubernetes.client.proto.V1alpha1Scheduling
          .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Scheduling
          .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.class,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder.class);
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

    public static final int VALUE_FIELD_NUMBER = 2;
    private int value_;
    /**
     *
     *
     * <pre>
     * The value of this priority class. This is the actual priority that pods
     * receive when they have the name of this class in their pod spec.
     * </pre>
     *
     * <code>optional int32 value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * The value of this priority class. This is the actual priority that pods
     * receive when they have the name of this class in their pod spec.
     * </pre>
     *
     * <code>optional int32 value = 2;</code>
     */
    public int getValue() {
      return value_;
    }

    public static final int GLOBALDEFAULT_FIELD_NUMBER = 3;
    private boolean globalDefault_;
    /**
     *
     *
     * <pre>
     * globalDefault specifies whether this PriorityClass should be considered as
     * the default priority for pods that do not have any priority class.
     * Only one PriorityClass can be marked as `globalDefault`. However, if more than
     * one PriorityClasses exists with their `globalDefault` field set to true,
     * the smallest value of such global default PriorityClasses will be used as the default priority.
     * +optional
     * </pre>
     *
     * <code>optional bool globalDefault = 3;</code>
     */
    public boolean hasGlobalDefault() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * globalDefault specifies whether this PriorityClass should be considered as
     * the default priority for pods that do not have any priority class.
     * Only one PriorityClass can be marked as `globalDefault`. However, if more than
     * one PriorityClasses exists with their `globalDefault` field set to true,
     * the smallest value of such global default PriorityClasses will be used as the default priority.
     * +optional
     * </pre>
     *
     * <code>optional bool globalDefault = 3;</code>
     */
    public boolean getGlobalDefault() {
      return globalDefault_;
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private volatile java.lang.Object description_;
    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          description_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * description is an arbitrary string that usually provides guidelines on
     * when this priority class should be used.
     * +optional
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PREEMPTIONPOLICY_FIELD_NUMBER = 5;
    private volatile java.lang.Object preemptionPolicy_;
    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    public boolean hasPreemptionPolicy() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    public java.lang.String getPreemptionPolicy() {
      java.lang.Object ref = preemptionPolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          preemptionPolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * One of Never, PreemptLowerPriority.
     * Defaults to PreemptLowerPriority if unset.
     * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * +optional
     * </pre>
     *
     * <code>optional string preemptionPolicy = 5;</code>
     */
    public com.google.protobuf.ByteString getPreemptionPolicyBytes() {
      java.lang.Object ref = preemptionPolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        preemptionPolicy_ = b;
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
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, globalDefault_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, preemptionPolicy_);
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
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, globalDefault_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, preemptionPolicy_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass other =
          (io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasValue() == other.hasValue());
      if (hasValue()) {
        result = result && (getValue() == other.getValue());
      }
      result = result && (hasGlobalDefault() == other.hasGlobalDefault());
      if (hasGlobalDefault()) {
        result = result && (getGlobalDefault() == other.getGlobalDefault());
      }
      result = result && (hasDescription() == other.hasDescription());
      if (hasDescription()) {
        result = result && getDescription().equals(other.getDescription());
      }
      result = result && (hasPreemptionPolicy() == other.hasPreemptionPolicy());
      if (hasPreemptionPolicy()) {
        result = result && getPreemptionPolicy().equals(other.getPreemptionPolicy());
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
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue();
      }
      if (hasGlobalDefault()) {
        hash = (37 * hash) + GLOBALDEFAULT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getGlobalDefault());
      }
      if (hasDescription()) {
        hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
        hash = (53 * hash) + getDescription().hashCode();
      }
      if (hasPreemptionPolicy()) {
        hash = (37 * hash) + PREEMPTIONPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getPreemptionPolicy().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass prototype) {
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
     * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass.
     * PriorityClass defines mapping from a priority class name to the priority
     * integer value. The value can be any valid integer.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.scheduling.v1alpha1.PriorityClass}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.scheduling.v1alpha1.PriorityClass)
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.class,
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.newBuilder()
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
        value_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        globalDefault_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        description_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        preemptionPolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass build() {
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass buildPartial() {
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass result =
            new io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass(this);
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
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.globalDefault_ = globalDefault_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.description_ = description_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.preemptionPolicy_ = preemptionPolicy_;
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        if (other.hasGlobalDefault()) {
          setGlobalDefault(other.getGlobalDefault());
        }
        if (other.hasDescription()) {
          bitField0_ |= 0x00000008;
          description_ = other.description_;
          onChanged();
        }
        if (other.hasPreemptionPolicy()) {
          bitField0_ |= 0x00000010;
          preemptionPolicy_ = other.preemptionPolicy_;
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
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass)
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

      private int value_;
      /**
       *
       *
       * <pre>
       * The value of this priority class. This is the actual priority that pods
       * receive when they have the name of this class in their pod spec.
       * </pre>
       *
       * <code>optional int32 value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * The value of this priority class. This is the actual priority that pods
       * receive when they have the name of this class in their pod spec.
       * </pre>
       *
       * <code>optional int32 value = 2;</code>
       */
      public int getValue() {
        return value_;
      }
      /**
       *
       *
       * <pre>
       * The value of this priority class. This is the actual priority that pods
       * receive when they have the name of this class in their pod spec.
       * </pre>
       *
       * <code>optional int32 value = 2;</code>
       */
      public Builder setValue(int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The value of this priority class. This is the actual priority that pods
       * receive when they have the name of this class in their pod spec.
       * </pre>
       *
       * <code>optional int32 value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = 0;
        onChanged();
        return this;
      }

      private boolean globalDefault_;
      /**
       *
       *
       * <pre>
       * globalDefault specifies whether this PriorityClass should be considered as
       * the default priority for pods that do not have any priority class.
       * Only one PriorityClass can be marked as `globalDefault`. However, if more than
       * one PriorityClasses exists with their `globalDefault` field set to true,
       * the smallest value of such global default PriorityClasses will be used as the default priority.
       * +optional
       * </pre>
       *
       * <code>optional bool globalDefault = 3;</code>
       */
      public boolean hasGlobalDefault() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * globalDefault specifies whether this PriorityClass should be considered as
       * the default priority for pods that do not have any priority class.
       * Only one PriorityClass can be marked as `globalDefault`. However, if more than
       * one PriorityClasses exists with their `globalDefault` field set to true,
       * the smallest value of such global default PriorityClasses will be used as the default priority.
       * +optional
       * </pre>
       *
       * <code>optional bool globalDefault = 3;</code>
       */
      public boolean getGlobalDefault() {
        return globalDefault_;
      }
      /**
       *
       *
       * <pre>
       * globalDefault specifies whether this PriorityClass should be considered as
       * the default priority for pods that do not have any priority class.
       * Only one PriorityClass can be marked as `globalDefault`. However, if more than
       * one PriorityClasses exists with their `globalDefault` field set to true,
       * the smallest value of such global default PriorityClasses will be used as the default priority.
       * +optional
       * </pre>
       *
       * <code>optional bool globalDefault = 3;</code>
       */
      public Builder setGlobalDefault(boolean value) {
        bitField0_ |= 0x00000004;
        globalDefault_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * globalDefault specifies whether this PriorityClass should be considered as
       * the default priority for pods that do not have any priority class.
       * Only one PriorityClass can be marked as `globalDefault`. However, if more than
       * one PriorityClasses exists with their `globalDefault` field set to true,
       * the smallest value of such global default PriorityClasses will be used as the default priority.
       * +optional
       * </pre>
       *
       * <code>optional bool globalDefault = 3;</code>
       */
      public Builder clearGlobalDefault() {
        bitField0_ = (bitField0_ & ~0x00000004);
        globalDefault_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       *
       *
       * <pre>
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public boolean hasDescription() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            description_ = s;
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
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public com.google.protobuf.ByteString getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public Builder setDescription(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        description_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public Builder clearDescription() {
        bitField0_ = (bitField0_ & ~0x00000008);
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * description is an arbitrary string that usually provides guidelines on
       * when this priority class should be used.
       * +optional
       * </pre>
       *
       * <code>optional string description = 4;</code>
       */
      public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        description_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object preemptionPolicy_ = "";
      /**
       *
       *
       * <pre>
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public boolean hasPreemptionPolicy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public java.lang.String getPreemptionPolicy() {
        java.lang.Object ref = preemptionPolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            preemptionPolicy_ = s;
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
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public com.google.protobuf.ByteString getPreemptionPolicyBytes() {
        java.lang.Object ref = preemptionPolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          preemptionPolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public Builder setPreemptionPolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        preemptionPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public Builder clearPreemptionPolicy() {
        bitField0_ = (bitField0_ & ~0x00000010);
        preemptionPolicy_ = getDefaultInstance().getPreemptionPolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * PreemptionPolicy is the Policy for preempting pods with lower priority.
       * One of Never, PreemptLowerPriority.
       * Defaults to PreemptLowerPriority if unset.
       * This field is beta-level, gated by the NonPreemptingPriority feature-gate.
       * +optional
       * </pre>
       *
       * <code>optional string preemptionPolicy = 5;</code>
       */
      public Builder setPreemptionPolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        preemptionPolicy_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.scheduling.v1alpha1.PriorityClass)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.scheduling.v1alpha1.PriorityClass)
    private static final io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass();
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PriorityClass> PARSER =
        new com.google.protobuf.AbstractParser<PriorityClass>() {
          @java.lang.Override
          public PriorityClass parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PriorityClass(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PriorityClass> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PriorityClass> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PriorityClassListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.scheduling.v1alpha1.PriorityClassList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass> getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder getItemsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * PriorityClassList is a collection of priority classes.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.scheduling.v1alpha1.PriorityClassList}
   */
  public static final class PriorityClassList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.scheduling.v1alpha1.PriorityClassList)
      PriorityClassListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PriorityClassList.newBuilder() to construct.
    private PriorityClassList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PriorityClassList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PriorityClassList(
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
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.PARSER,
                        extensionRegistry));
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
      return io.kubernetes.client.proto.V1alpha1Scheduling
          .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Scheduling
          .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.class,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
    private java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass> items_;
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of PriorityClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder getItemsOrBuilder(
        int index) {
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList other =
          (io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList) obj;

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

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parseFrom(
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
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList prototype) {
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
     * PriorityClassList is a collection of priority classes.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.scheduling.v1alpha1.PriorityClassList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.scheduling.v1alpha1.PriorityClassList)
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.class,
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.newBuilder()
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
        return io.kubernetes.client.proto.V1alpha1Scheduling
            .internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList build() {
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList buildPartial() {
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList result =
            new io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList(this);
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
        if (other instanceof io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList other) {
        if (other
            == io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList.getDefaultInstance())
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
        io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList)
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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

      private java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass>
          getItemsList() {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass getItems(int index) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass value) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder builderForValue) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass value) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass value) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder builderForValue) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder builderForValue) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass>
              values) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder getItemsOrBuilder(
          int index) {
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>
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
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of PriorityClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.scheduling.v1alpha1.PriorityClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder,
              io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass,
                  io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClass.Builder,
                  io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.scheduling.v1alpha1.PriorityClassList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.scheduling.v1alpha1.PriorityClassList)
    private static final io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList();
    }

    public static io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PriorityClassList> PARSER =
        new com.google.protobuf.AbstractParser<PriorityClassList>() {
          @java.lang.Override
          public PriorityClassList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PriorityClassList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PriorityClassList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PriorityClassList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Scheduling.PriorityClassList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.k8s.io/api/scheduling/v1alpha1/generat"
          + "ed.proto\022\036k8s.io.api.scheduling.v1alpha1"
          + "\032\"k8s.io/api/core/v1/generated.proto\0324k8"
          + "s.io/apimachinery/pkg/apis/meta/v1/gener"
          + "ated.proto\032/k8s.io/apimachinery/pkg/runt"
          + "ime/generated.proto\0326k8s.io/apimachinery"
          + "/pkg/runtime/schema/generated.proto\"\250\001\n\r"
          + "PriorityClass\022B\n\010metadata\030\001 \001(\01320.k8s.io"
          + ".apimachinery.pkg.apis.meta.v1.ObjectMet"
          + "a\022\r\n\005value\030\002 \001(\005\022\025\n\rglobalDefault\030\003 \001(\010\022"
          + "\023\n\013description\030\004 \001(\t\022\030\n\020preemptionPolicy"
          + "\030\005 \001(\t\"\223\001\n\021PriorityClassList\022@\n\010metadata"
          + "\030\001 \001(\0132..k8s.io.apimachinery.pkg.apis.me"
          + "ta.v1.ListMeta\022<\n\005items\030\002 \003(\0132-.k8s.io.a"
          + "pi.scheduling.v1alpha1.PriorityClassB:\n\032"
          + "io.kubernetes.client.protoB\022V1alpha1Sche"
          + "dulingZ\010v1alpha1"
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
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClass_descriptor,
            new java.lang.String[] {
              "Metadata", "Value", "GlobalDefault", "Description", "PreemptionPolicy",
            });
    internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_scheduling_v1alpha1_PriorityClassList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
