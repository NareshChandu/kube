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

public final class V1beta1Authentication {
  private V1beta1Authentication() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface ExtraValueOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authentication.v1beta1.ExtraValue)
      com.google.protobuf.MessageOrBuilder {

    /** <code>repeated string items = 1;</code> */
    java.util.List<java.lang.String> getItemsList();
    /** <code>repeated string items = 1;</code> */
    int getItemsCount();
    /** <code>repeated string items = 1;</code> */
    java.lang.String getItems(int index);
    /** <code>repeated string items = 1;</code> */
    com.google.protobuf.ByteString getItemsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * ExtraValue masks the value so protobuf can generate
   * +protobuf.nullable=true
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authentication.v1beta1.ExtraValue}
   */
  public static final class ExtraValue extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authentication.v1beta1.ExtraValue)
      ExtraValueOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExtraValue.newBuilder() to construct.
    private ExtraValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExtraValue() {
      items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExtraValue(
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  items_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                items_.add(bs);
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
          items_ = items_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.class,
              io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.Builder.class);
    }

    public static final int ITEMS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList items_;
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ProtocolStringList getItemsList() {
      return items_;
    }
    /** <code>repeated string items = 1;</code> */
    public int getItemsCount() {
      return items_.size();
    }
    /** <code>repeated string items = 1;</code> */
    public java.lang.String getItems(int index) {
      return items_.get(index);
    }
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ByteString getItemsBytes(int index) {
      return items_.getByteString(index);
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
      for (int i = 0; i < items_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, items_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += computeStringSizeNoTag(items_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authentication.ExtraValue)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authentication.ExtraValue other =
          (io.kubernetes.client.proto.V1beta1Authentication.ExtraValue) obj;

      boolean result = true;
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
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parseFrom(
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
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue prototype) {
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
     * ExtraValue masks the value so protobuf can generate
     * +protobuf.nullable=true
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authentication.v1beta1.ExtraValue}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authentication.v1beta1.ExtraValue)
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.class,
                io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.newBuilder()
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
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue build() {
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue buildPartial() {
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue result =
            new io.kubernetes.client.proto.V1beta1Authentication.ExtraValue(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = items_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Authentication.ExtraValue) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authentication.ExtraValue) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Authentication.ExtraValue other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authentication.ExtraValue.getDefaultInstance())
          return this;
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
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
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authentication.ExtraValue)
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

      private com.google.protobuf.LazyStringList items_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = new com.google.protobuf.LazyStringArrayList(items_);
          bitField0_ |= 0x00000001;
        }
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ProtocolStringList getItemsList() {
        return items_.getUnmodifiableView();
      }
      /** <code>repeated string items = 1;</code> */
      public int getItemsCount() {
        return items_.size();
      }
      /** <code>repeated string items = 1;</code> */
      public java.lang.String getItems(int index) {
        return items_.get(index);
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ByteString getItemsBytes(int index) {
        return items_.getByteString(index);
      }
      /** <code>repeated string items = 1;</code> */
      public Builder setItems(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItems(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addAllItems(java.lang.Iterable<java.lang.String> values) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder clearItems() {
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItemsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authentication.v1beta1.ExtraValue)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authentication.v1beta1.ExtraValue)
    private static final io.kubernetes.client.proto.V1beta1Authentication.ExtraValue
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authentication.ExtraValue();
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExtraValue> PARSER =
        new com.google.protobuf.AbstractParser<ExtraValue>() {
          @java.lang.Override
          public ExtraValue parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExtraValue(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExtraValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtraValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface TokenReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authentication.v1beta1.TokenReview)
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
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * TokenReview attempts to authenticate a token to a known user.
   * Note: TokenReview requests may be cached by the webhook token authenticator
   * plugin in the kube-apiserver.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReview}
   */
  public static final class TokenReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authentication.v1beta1.TokenReview)
      TokenReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use TokenReview.newBuilder() to construct.
    private TokenReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TokenReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TokenReview(
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
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.PARSER,
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
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.PARSER,
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
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authentication.TokenReview.class,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReview.Builder.class);
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
    private io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.getDefaultInstance()
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authentication.TokenReview other =
          (io.kubernetes.client.proto.V1beta1Authentication.TokenReview) obj;

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

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview parseFrom(
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReview prototype) {
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
     * TokenReview attempts to authenticate a token to a known user.
     * Note: TokenReview requests may be cached by the webhook token authenticator
     * plugin in the kube-apiserver.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authentication.v1beta1.TokenReview)
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authentication.TokenReview.class,
                io.kubernetes.client.proto.V1beta1Authentication.TokenReview.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Authentication.TokenReview.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authentication.TokenReview.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReview build() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReview result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReview buildPartial() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReview result =
            new io.kubernetes.client.proto.V1beta1Authentication.TokenReview(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReview) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authentication.TokenReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Authentication.TokenReview other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authentication.TokenReview.getDefaultInstance())
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authentication.TokenReview)
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

      private io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec value) {
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
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder
              builderForValue) {
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
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.newBuilder(spec_)
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
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
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
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec,
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
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
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus value) {
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
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder
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
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.newBuilder(
                        status_)
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
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
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
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the token can be authenticated.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.TokenReviewStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus,
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authentication.v1beta1.TokenReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authentication.v1beta1.TokenReview)
    private static final io.kubernetes.client.proto.V1beta1Authentication.TokenReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authentication.TokenReview();
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TokenReview> PARSER =
        new com.google.protobuf.AbstractParser<TokenReview>() {
          @java.lang.Override
          public TokenReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TokenReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<TokenReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TokenReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface TokenReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authentication.v1beta1.TokenReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    boolean hasToken();
    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    java.lang.String getToken();
    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    com.google.protobuf.ByteString getTokenBytes();

    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    java.util.List<java.lang.String> getAudiencesList();
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    int getAudiencesCount();
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    java.lang.String getAudiences(int index);
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    com.google.protobuf.ByteString getAudiencesBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * TokenReviewSpec is a description of the token authentication request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReviewSpec}
   */
  public static final class TokenReviewSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authentication.v1beta1.TokenReviewSpec)
      TokenReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use TokenReviewSpec.newBuilder() to construct.
    private TokenReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TokenReviewSpec() {
      token_ = "";
      audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TokenReviewSpec(
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
                token_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  audiences_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                audiences_.add(bs);
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
          audiences_ = audiences_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.class,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder.class);
    }

    private int bitField0_;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private volatile java.lang.Object token_;
    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          token_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Token is the opaque bearer token.
     * +optional
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public com.google.protobuf.ByteString getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList audiences_;
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getAudiencesList() {
      return audiences_;
    }
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    public int getAudiencesCount() {
      return audiences_.size();
    }
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    public java.lang.String getAudiences(int index) {
      return audiences_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Audiences is a list of the identifiers that the resource server presented
     * with the token identifies as. Audience-aware token authenticators will
     * verify that the token was intended for at least one of the audiences in
     * this list. If no audiences are provided, the audience will default to the
     * audience of the Kubernetes apiserver.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 2;</code>
     */
    public com.google.protobuf.ByteString getAudiencesBytes(int index) {
      return audiences_.getByteString(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
      }
      for (int i = 0; i < audiences_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audiences_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < audiences_.size(); i++) {
          dataSize += computeStringSizeNoTag(audiences_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAudiencesList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec other =
          (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec) obj;

      boolean result = true;
      result = result && (hasToken() == other.hasToken());
      if (hasToken()) {
        result = result && getToken().equals(other.getToken());
      }
      result = result && getAudiencesList().equals(other.getAudiencesList());
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
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      if (getAudiencesCount() > 0) {
        hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
        hash = (53 * hash) + getAudiencesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parseFrom(
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec prototype) {
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
     * TokenReviewSpec is a description of the token authentication request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReviewSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authentication.v1beta1.TokenReviewSpec)
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.class,
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec.newBuilder()
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
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec build() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec buildPartial() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec result =
            new io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.token_ = token_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          audiences_ = audiences_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.audiences_ = audiences_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
                .getDefaultInstance()) return this;
        if (other.hasToken()) {
          bitField0_ |= 0x00000001;
          token_ = other.token_;
          onChanged();
        }
        if (!other.audiences_.isEmpty()) {
          if (audiences_.isEmpty()) {
            audiences_ = other.audiences_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAudiencesIsMutable();
            audiences_.addAll(other.audiences_);
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec)
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

      private java.lang.Object token_ = "";
      /**
       *
       *
       * <pre>
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            token_ = s;
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
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public com.google.protobuf.ByteString getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public Builder setToken(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Token is the opaque bearer token.
       * +optional
       * </pre>
       *
       * <code>optional string token = 1;</code>
       */
      public Builder setTokenBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList audiences_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureAudiencesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          audiences_ = new com.google.protobuf.LazyStringArrayList(audiences_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getAudiencesList() {
        return audiences_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public int getAudiencesCount() {
        return audiences_.size();
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public java.lang.String getAudiences(int index) {
        return audiences_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public com.google.protobuf.ByteString getAudiencesBytes(int index) {
        return audiences_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public Builder setAudiences(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public Builder addAudiences(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public Builder addAllAudiences(java.lang.Iterable<java.lang.String> values) {
        ensureAudiencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, audiences_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public Builder clearAudiences() {
        audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences is a list of the identifiers that the resource server presented
       * with the token identifies as. Audience-aware token authenticators will
       * verify that the token was intended for at least one of the audiences in
       * this list. If no audiences are provided, the audience will default to the
       * audience of the Kubernetes apiserver.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 2;</code>
       */
      public Builder addAudiencesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(value);
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authentication.v1beta1.TokenReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authentication.v1beta1.TokenReviewSpec)
    private static final io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TokenReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<TokenReviewSpec>() {
          @java.lang.Override
          public TokenReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TokenReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<TokenReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TokenReviewSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface TokenReviewStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authentication.v1beta1.TokenReviewStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Authenticated indicates that the token was associated with a known user.
     * +optional
     * </pre>
     *
     * <code>optional bool authenticated = 1;</code>
     */
    boolean hasAuthenticated();
    /**
     *
     *
     * <pre>
     * Authenticated indicates that the token was associated with a known user.
     * +optional
     * </pre>
     *
     * <code>optional bool authenticated = 1;</code>
     */
    boolean getAuthenticated();

    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    boolean hasUser();
    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.UserInfo getUser();
    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder getUserOrBuilder();

    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    java.util.List<java.lang.String> getAudiencesList();
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    int getAudiencesCount();
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    java.lang.String getAudiences(int index);
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    com.google.protobuf.ByteString getAudiencesBytes(int index);

    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    boolean hasError();
    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    java.lang.String getError();
    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    com.google.protobuf.ByteString getErrorBytes();
  }
  /**
   *
   *
   * <pre>
   * TokenReviewStatus is the result of the token authentication request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReviewStatus}
   */
  public static final class TokenReviewStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authentication.v1beta1.TokenReviewStatus)
      TokenReviewStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use TokenReviewStatus.newBuilder() to construct.
    private TokenReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TokenReviewStatus() {
      authenticated_ = false;
      audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      error_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TokenReviewStatus(
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
                authenticated_ = input.readBool();
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = user_.toBuilder();
                }
                user_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authentication.UserInfo.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(user_);
                  user_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                error_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  audiences_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                audiences_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          audiences_ = audiences_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.class,
              io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder.class);
    }

    private int bitField0_;
    public static final int AUTHENTICATED_FIELD_NUMBER = 1;
    private boolean authenticated_;
    /**
     *
     *
     * <pre>
     * Authenticated indicates that the token was associated with a known user.
     * +optional
     * </pre>
     *
     * <code>optional bool authenticated = 1;</code>
     */
    public boolean hasAuthenticated() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Authenticated indicates that the token was associated with a known user.
     * +optional
     * </pre>
     *
     * <code>optional bool authenticated = 1;</code>
     */
    public boolean getAuthenticated() {
      return authenticated_;
    }

    public static final int USER_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authentication.UserInfo user_;
    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.UserInfo getUser() {
      return user_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance()
          : user_;
    }
    /**
     *
     *
     * <pre>
     * User is the UserInfo associated with the provided token.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder getUserOrBuilder() {
      return user_ == null
          ? io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance()
          : user_;
    }

    public static final int AUDIENCES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList audiences_;
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getAudiencesList() {
      return audiences_;
    }
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    public int getAudiencesCount() {
      return audiences_.size();
    }
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    public java.lang.String getAudiences(int index) {
      return audiences_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Audiences are audience identifiers chosen by the authenticator that are
     * compatible with both the TokenReview and token. An identifier is any
     * identifier in the intersection of the TokenReviewSpec audiences and the
     * token's audiences. A client of the TokenReview API that sets the
     * spec.audiences field should validate that a compatible audience identifier
     * is returned in the status.audiences field to ensure that the TokenReview
     * server is audience aware. If a TokenReview returns an empty
     * status.audience field where status.authenticated is "true", the token is
     * valid against the audience of the Kubernetes API server.
     * +optional
     * </pre>
     *
     * <code>repeated string audiences = 4;</code>
     */
    public com.google.protobuf.ByteString getAudiencesBytes(int index) {
      return audiences_.getByteString(index);
    }

    public static final int ERROR_FIELD_NUMBER = 3;
    private volatile java.lang.Object error_;
    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Error indicates that the token couldn't be checked
     * +optional
     * </pre>
     *
     * <code>optional string error = 3;</code>
     */
    public com.google.protobuf.ByteString getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        error_ = b;
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
        output.writeBool(1, authenticated_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getUser());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, error_);
      }
      for (int i = 0; i < audiences_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, audiences_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, authenticated_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUser());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, error_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < audiences_.size(); i++) {
          dataSize += computeStringSizeNoTag(audiences_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAudiencesList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus other =
          (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus) obj;

      boolean result = true;
      result = result && (hasAuthenticated() == other.hasAuthenticated());
      if (hasAuthenticated()) {
        result = result && (getAuthenticated() == other.getAuthenticated());
      }
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser().equals(other.getUser());
      }
      result = result && getAudiencesList().equals(other.getAudiencesList());
      result = result && (hasError() == other.hasError());
      if (hasError()) {
        result = result && getError().equals(other.getError());
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
      if (hasAuthenticated()) {
        hash = (37 * hash) + AUTHENTICATED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAuthenticated());
      }
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      if (getAudiencesCount() > 0) {
        hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
        hash = (53 * hash) + getAudiencesList().hashCode();
      }
      if (hasError()) {
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parseFrom(
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus prototype) {
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
     * TokenReviewStatus is the result of the token authentication request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authentication.v1beta1.TokenReviewStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authentication.v1beta1.TokenReviewStatus)
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.class,
                io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getUserFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        authenticated_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (userBuilder_ == null) {
          user_ = null;
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus build() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus buildPartial() {
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus result =
            new io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.authenticated_ = authenticated_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          audiences_ = audiences_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.audiences_ = audiences_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.error_ = error_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
                .getDefaultInstance()) return this;
        if (other.hasAuthenticated()) {
          setAuthenticated(other.getAuthenticated());
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        if (!other.audiences_.isEmpty()) {
          if (audiences_.isEmpty()) {
            audiences_ = other.audiences_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAudiencesIsMutable();
            audiences_.addAll(other.audiences_);
          }
          onChanged();
        }
        if (other.hasError()) {
          bitField0_ |= 0x00000008;
          error_ = other.error_;
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
        io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus)
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

      private boolean authenticated_;
      /**
       *
       *
       * <pre>
       * Authenticated indicates that the token was associated with a known user.
       * +optional
       * </pre>
       *
       * <code>optional bool authenticated = 1;</code>
       */
      public boolean hasAuthenticated() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Authenticated indicates that the token was associated with a known user.
       * +optional
       * </pre>
       *
       * <code>optional bool authenticated = 1;</code>
       */
      public boolean getAuthenticated() {
        return authenticated_;
      }
      /**
       *
       *
       * <pre>
       * Authenticated indicates that the token was associated with a known user.
       * +optional
       * </pre>
       *
       * <code>optional bool authenticated = 1;</code>
       */
      public Builder setAuthenticated(boolean value) {
        bitField0_ |= 0x00000001;
        authenticated_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Authenticated indicates that the token was associated with a known user.
       * +optional
       * </pre>
       *
       * <code>optional bool authenticated = 1;</code>
       */
      public Builder clearAuthenticated() {
        bitField0_ = (bitField0_ & ~0x00000001);
        authenticated_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1beta1Authentication.UserInfo user_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo,
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder>
          userBuilder_;
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public boolean hasUser() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfo getUser() {
        if (userBuilder_ == null) {
          return user_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance()
              : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public Builder setUser(io.kubernetes.client.proto.V1beta1Authentication.UserInfo value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public Builder setUser(
          io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public Builder mergeUser(io.kubernetes.client.proto.V1beta1Authentication.UserInfo value) {
        if (userBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && user_ != null
              && user_
                  != io.kubernetes.client.proto.V1beta1Authentication.UserInfo
                      .getDefaultInstance()) {
            user_ =
                io.kubernetes.client.proto.V1beta1Authentication.UserInfo.newBuilder(user_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder getUserBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null
              ? io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance()
              : user_;
        }
      }
      /**
       *
       *
       * <pre>
       * User is the UserInfo associated with the provided token.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authentication.v1beta1.UserInfo user = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo,
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder,
              io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder>
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authentication.UserInfo,
                  io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder,
                  io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder>(
                  getUser(), getParentForChildren(), isClean());
          user_ = null;
        }
        return userBuilder_;
      }

      private com.google.protobuf.LazyStringList audiences_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureAudiencesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          audiences_ = new com.google.protobuf.LazyStringArrayList(audiences_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getAudiencesList() {
        return audiences_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public int getAudiencesCount() {
        return audiences_.size();
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public java.lang.String getAudiences(int index) {
        return audiences_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public com.google.protobuf.ByteString getAudiencesBytes(int index) {
        return audiences_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public Builder setAudiences(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public Builder addAudiences(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public Builder addAllAudiences(java.lang.Iterable<java.lang.String> values) {
        ensureAudiencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, audiences_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public Builder clearAudiences() {
        audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audiences are audience identifiers chosen by the authenticator that are
       * compatible with both the TokenReview and token. An identifier is any
       * identifier in the intersection of the TokenReviewSpec audiences and the
       * token's audiences. A client of the TokenReview API that sets the
       * spec.audiences field should validate that a compatible audience identifier
       * is returned in the status.audiences field to ensure that the TokenReview
       * server is audience aware. If a TokenReview returns an empty
       * status.audience field where status.authenticated is "true", the token is
       * valid against the audience of the Kubernetes API server.
       * +optional
       * </pre>
       *
       * <code>repeated string audiences = 4;</code>
       */
      public Builder addAudiencesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object error_ = "";
      /**
       *
       *
       * <pre>
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            error_ = s;
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
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public com.google.protobuf.ByteString getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public Builder setError(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000008);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Error indicates that the token couldn't be checked
       * +optional
       * </pre>
       *
       * <code>optional string error = 3;</code>
       */
      public Builder setErrorBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        error_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authentication.v1beta1.TokenReviewStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authentication.v1beta1.TokenReviewStatus)
    private static final io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TokenReviewStatus> PARSER =
        new com.google.protobuf.AbstractParser<TokenReviewStatus>() {
          @java.lang.Override
          public TokenReviewStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TokenReviewStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<TokenReviewStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TokenReviewStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authentication.TokenReviewStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface UserInfoOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authentication.v1beta1.UserInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    boolean hasUsername();
    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    java.lang.String getUsername();
    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    com.google.protobuf.ByteString getUsernameBytes();

    /**
     *
     *
     * <pre>
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
     */
    boolean hasUid();
    /**
     *
     *
     * <pre>
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
     */
    java.lang.String getUid();
    /**
     *
     *
     * <pre>
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
     */
    com.google.protobuf.ByteString getUidBytes();

    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    java.util.List<java.lang.String> getGroupsList();
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    int getGroupsCount();
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    java.lang.String getGroups(int index);
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    com.google.protobuf.ByteString getGroupsBytes(int index);

    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    int getExtraCount();
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    boolean containsExtra(java.lang.String key);
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        getExtra();
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        getExtraMap();
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue defaultValue);
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrThrow(
        java.lang.String key);
  }
  /**
   *
   *
   * <pre>
   * UserInfo holds the information about the user needed to implement the
   * user.Info interface.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authentication.v1beta1.UserInfo}
   */
  public static final class UserInfo extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authentication.v1beta1.UserInfo)
      UserInfoOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use UserInfo.newBuilder() to construct.
    private UserInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private UserInfo() {
      username_ = "";
      uid_ = "";
      groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private UserInfo(
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
                username_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                uid_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  groups_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                groups_.add(bs);
                break;
              }
            case 34:
              {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  extra_ =
                      com.google.protobuf.MapField.newMapField(
                          ExtraDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000008;
                }
                com.google.protobuf.MapEntry<
                        java.lang.String,
                        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
                    extra__ =
                        input.readMessage(
                            ExtraDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                extra_.getMutableMap().put(extra__.getKey(), extra__.getValue());
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          groups_ = groups_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 4:
          return internalGetExtra();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authentication
          .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo.class,
              io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder.class);
    }

    private int bitField0_;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object username_;
    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The name that uniquely identifies this user among all active users.
     * +optional
     * </pre>
     *
     * <code>optional string username = 1;</code>
     */
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UID_FIELD_NUMBER = 2;
    private volatile java.lang.Object uid_;
    /**
     *
     *
     * <pre>
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
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
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 2;</code>
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

    public static final int GROUPS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList groups_;
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getGroupsList() {
      return groups_;
    }
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    public int getGroupsCount() {
      return groups_.size();
    }
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    public java.lang.String getGroups(int index) {
      return groups_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The names of groups this user is a part of.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 3;</code>
     */
    public com.google.protobuf.ByteString getGroupsBytes(int index) {
      return groups_.getByteString(index);
    }

    public static final int EXTRA_FIELD_NUMBER = 4;

    private static final class ExtraDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          defaultEntry =
              com.google.protobuf.MapEntry
                  .<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
                      newDefaultInstance(
                          io.kubernetes.client.proto.V1beta1Authentication
                              .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_descriptor,
                          com.google.protobuf.WireFormat.FieldType.STRING,
                          "",
                          com.google.protobuf.WireFormat.FieldType.MESSAGE,
                          io.kubernetes.client.proto.V1beta1Authentication.ExtraValue
                              .getDefaultInstance());
    }

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        extra_;

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        internalGetExtra() {
      if (extra_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
      }
      return extra_;
    }

    public int getExtraCount() {
      return internalGetExtra().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    public boolean containsExtra(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetExtra().getMap().containsKey(key);
    }
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        getExtra() {
      return getExtraMap();
    }
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
        getExtraMap() {
      return internalGetExtra().getMap();
    }
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Authentication.ExtraValue defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          map = internalGetExtra().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Any additional information provided by the authenticator.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          map = internalGetExtra().getMap();
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uid_);
      }
      for (int i = 0; i < groups_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, groups_.getRaw(i));
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetExtra(), ExtraDefaultEntryHolder.defaultEntry, 4);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < groups_.size(); i++) {
          dataSize += computeStringSizeNoTag(groups_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getGroupsList().size();
      }
      for (java.util.Map.Entry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          entry : internalGetExtra().getMap().entrySet()) {
        com.google.protobuf.MapEntry<
                java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
            extra__ =
                ExtraDefaultEntryHolder.defaultEntry
                    .newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, extra__);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authentication.UserInfo)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authentication.UserInfo other =
          (io.kubernetes.client.proto.V1beta1Authentication.UserInfo) obj;

      boolean result = true;
      result = result && (hasUsername() == other.hasUsername());
      if (hasUsername()) {
        result = result && getUsername().equals(other.getUsername());
      }
      result = result && (hasUid() == other.hasUid());
      if (hasUid()) {
        result = result && getUid().equals(other.getUid());
      }
      result = result && getGroupsList().equals(other.getGroupsList());
      result = result && internalGetExtra().equals(other.internalGetExtra());
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
      if (hasUsername()) {
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUsername().hashCode();
      }
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      if (getGroupsCount() > 0) {
        hash = (37 * hash) + GROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getGroupsList().hashCode();
      }
      if (!internalGetExtra().getMap().isEmpty()) {
        hash = (37 * hash) + EXTRA_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExtra().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo parseFrom(
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
        io.kubernetes.client.proto.V1beta1Authentication.UserInfo prototype) {
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
     * UserInfo holds the information about the user needed to implement the
     * user.Info interface.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authentication.v1beta1.UserInfo}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authentication.v1beta1.UserInfo)
        io.kubernetes.client.proto.V1beta1Authentication.UserInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 4:
            return internalGetExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 4:
            return internalGetMutableExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authentication.UserInfo.class,
                io.kubernetes.client.proto.V1beta1Authentication.UserInfo.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Authentication.UserInfo.newBuilder()
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
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        internalGetMutableExtra().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authentication
            .internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfo getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfo build() {
        io.kubernetes.client.proto.V1beta1Authentication.UserInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authentication.UserInfo buildPartial() {
        io.kubernetes.client.proto.V1beta1Authentication.UserInfo result =
            new io.kubernetes.client.proto.V1beta1Authentication.UserInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          groups_ = groups_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.groups_ = groups_;
        result.extra_ = internalGetExtra();
        result.extra_.makeImmutable();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Authentication.UserInfo) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authentication.UserInfo) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Authentication.UserInfo other) {
        if (other == io.kubernetes.client.proto.V1beta1Authentication.UserInfo.getDefaultInstance())
          return this;
        if (other.hasUsername()) {
          bitField0_ |= 0x00000001;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasUid()) {
          bitField0_ |= 0x00000002;
          uid_ = other.uid_;
          onChanged();
        }
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
        internalGetMutableExtra().mergeFrom(other.internalGetExtra());
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
        io.kubernetes.client.proto.V1beta1Authentication.UserInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authentication.UserInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object username_ = "";
      /**
       *
       *
       * <pre>
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
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
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public com.google.protobuf.ByteString getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public Builder setUsername(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000001);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The name that uniquely identifies this user among all active users.
       * +optional
       * </pre>
       *
       * <code>optional string username = 1;</code>
       */
      public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object uid_ = "";
      /**
       *
       *
       * <pre>
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
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
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
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
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
       */
      public Builder setUid(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A unique value that identifies this user across time. If this user is
       * deleted and another user by the same name is added, they will have
       * different UIDs.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 2;</code>
       */
      public Builder setUidBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        uid_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList groups_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureGroupsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          groups_ = new com.google.protobuf.LazyStringArrayList(groups_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getGroupsList() {
        return groups_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public int getGroupsCount() {
        return groups_.size();
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public java.lang.String getGroups(int index) {
        return groups_.get(index);
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public com.google.protobuf.ByteString getGroupsBytes(int index) {
        return groups_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public Builder setGroups(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public Builder addGroups(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public Builder addAllGroups(java.lang.Iterable<java.lang.String> values) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, groups_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public Builder clearGroups() {
        groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The names of groups this user is a part of.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 3;</code>
       */
      public Builder addGroupsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          extra_;

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          internalGetExtra() {
        if (extra_ == null) {
          return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        return extra_;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          internalGetMutableExtra() {
        onChanged();
        ;
        if (extra_ == null) {
          extra_ = com.google.protobuf.MapField.newMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        if (!extra_.isMutable()) {
          extra_ = extra_.copy();
        }
        return extra_;
      }

      public int getExtraCount() {
        return internalGetExtra().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public boolean containsExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetExtra().getMap().containsKey(key);
      }
      /** Use {@link #getExtraMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          getExtra() {
        return getExtraMap();
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          getExtraMap() {
        return internalGetExtra().getMap();
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrDefault(
          java.lang.String key,
          io.kubernetes.client.proto.V1beta1Authentication.ExtraValue defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
            map = internalGetExtra().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public io.kubernetes.client.proto.V1beta1Authentication.ExtraValue getExtraOrThrow(
          java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
            map = internalGetExtra().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearExtra() {
        internalGetMutableExtra().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public Builder removeExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
          getMutableExtra() {
        return internalGetMutableExtra().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public Builder putExtra(
          java.lang.String key, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Any additional information provided by the authenticator.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authentication.v1beta1.ExtraValue&gt; extra = 4;</code>
       */
      public Builder putAllExtra(
          java.util.Map<
                  java.lang.String, io.kubernetes.client.proto.V1beta1Authentication.ExtraValue>
              values) {
        internalGetMutableExtra().getMutableMap().putAll(values);
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authentication.v1beta1.UserInfo)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authentication.v1beta1.UserInfo)
    private static final io.kubernetes.client.proto.V1beta1Authentication.UserInfo DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authentication.UserInfo();
    }

    public static io.kubernetes.client.proto.V1beta1Authentication.UserInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<UserInfo> PARSER =
        new com.google.protobuf.AbstractParser<UserInfo>() {
          @java.lang.Override
          public UserInfo parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new UserInfo(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<UserInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authentication.UserInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_TokenReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_UserInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1k8s.io/api/authentication/v1beta1/gene"
          + "rated.proto\022!k8s.io.api.authentication.v"
          + "1beta1\0324k8s.io/apimachinery/pkg/apis/met"
          + "a/v1/generated.proto\032/k8s.io/apimachiner"
          + "y/pkg/runtime/generated.proto\0326k8s.io/ap"
          + "imachinery/pkg/runtime/schema/generated."
          + "proto\"\033\n\nExtraValue\022\r\n\005items\030\001 \003(\t\"\331\001\n\013T"
          + "okenReview\022B\n\010metadata\030\001 \001(\01320.k8s.io.ap"
          + "imachinery.pkg.apis.meta.v1.ObjectMeta\022@"
          + "\n\004spec\030\002 \001(\01322.k8s.io.api.authentication"
          + ".v1beta1.TokenReviewSpec\022D\n\006status\030\003 \001(\013"
          + "24.k8s.io.api.authentication.v1beta1.Tok"
          + "enReviewStatus\"3\n\017TokenReviewSpec\022\r\n\005tok"
          + "en\030\001 \001(\t\022\021\n\taudiences\030\002 \003(\t\"\207\001\n\021TokenRev"
          + "iewStatus\022\025\n\rauthenticated\030\001 \001(\010\0229\n\004user"
          + "\030\002 \001(\0132+.k8s.io.api.authentication.v1bet"
          + "a1.UserInfo\022\021\n\taudiences\030\004 \003(\t\022\r\n\005error\030"
          + "\003 \001(\t\"\335\001\n\010UserInfo\022\020\n\010username\030\001 \001(\t\022\013\n\003"
          + "uid\030\002 \001(\t\022\016\n\006groups\030\003 \003(\t\022E\n\005extra\030\004 \003(\013"
          + "26.k8s.io.api.authentication.v1beta1.Use"
          + "rInfo.ExtraEntry\032[\n\nExtraEntry\022\013\n\003key\030\001 "
          + "\001(\t\022<\n\005value\030\002 \001(\0132-.k8s.io.api.authenti"
          + "cation.v1beta1.ExtraValue:\0028\001B<\n\032io.kube"
          + "rnetes.client.protoB\025V1beta1Authenticati"
          + "onZ\007v1beta1"
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
    internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_ExtraValue_descriptor,
            new java.lang.String[] {
              "Items",
            });
    internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_authentication_v1beta1_TokenReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_TokenReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_TokenReviewSpec_descriptor,
            new java.lang.String[] {
              "Token", "Audiences",
            });
    internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_TokenReviewStatus_descriptor,
            new java.lang.String[] {
              "Authenticated", "User", "Audiences", "Error",
            });
    internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_authentication_v1beta1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor,
            new java.lang.String[] {
              "Username", "Uid", "Groups", "Extra",
            });
    internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_descriptor =
        internal_static_k8s_io_api_authentication_v1beta1_UserInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authentication_v1beta1_UserInfo_ExtraEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
