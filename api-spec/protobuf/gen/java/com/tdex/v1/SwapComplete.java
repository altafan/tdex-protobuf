// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/swap.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.SwapComplete}
 */
public final class SwapComplete extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdex.v1.SwapComplete)
    SwapCompleteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SwapComplete.newBuilder() to construct.
  private SwapComplete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SwapComplete() {
    id_ = "";
    acceptId_ = "";
    transaction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SwapComplete();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SwapComplete(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            acceptId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            transaction_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tdex.v1.SwapProto.internal_static_tdex_v1_SwapComplete_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdex.v1.SwapProto.internal_static_tdex_v1_SwapComplete_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdex.v1.SwapComplete.class, com.tdex.v1.SwapComplete.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCEPT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object acceptId_;
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @return The acceptId.
   */
  @java.lang.Override
  public java.lang.String getAcceptId() {
    java.lang.Object ref = acceptId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceptId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @return The bytes for acceptId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcceptIdBytes() {
    java.lang.Object ref = acceptId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acceptId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object transaction_;
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  @java.lang.Override
  public java.lang.String getTransaction() {
    java.lang.Object ref = transaction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transaction_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The bytes for transaction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionBytes() {
    java.lang.Object ref = transaction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transaction_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceptId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acceptId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, transaction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceptId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acceptId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, transaction_);
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
    if (!(obj instanceof com.tdex.v1.SwapComplete)) {
      return super.equals(obj);
    }
    com.tdex.v1.SwapComplete other = (com.tdex.v1.SwapComplete) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getAcceptId()
        .equals(other.getAcceptId())) return false;
    if (!getTransaction()
        .equals(other.getTransaction())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + ACCEPT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAcceptId().hashCode();
    hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
    hash = (53 * hash) + getTransaction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdex.v1.SwapComplete parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.SwapComplete parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.SwapComplete parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdex.v1.SwapComplete parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdex.v1.SwapComplete parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdex.v1.SwapComplete parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.SwapComplete prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tdex.v1.SwapComplete}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.SwapComplete)
      com.tdex.v1.SwapCompleteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdex.v1.SwapProto.internal_static_tdex_v1_SwapComplete_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdex.v1.SwapProto.internal_static_tdex_v1_SwapComplete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdex.v1.SwapComplete.class, com.tdex.v1.SwapComplete.Builder.class);
    }

    // Construct using com.tdex.v1.SwapComplete.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      acceptId_ = "";

      transaction_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdex.v1.SwapProto.internal_static_tdex_v1_SwapComplete_descriptor;
    }

    @java.lang.Override
    public com.tdex.v1.SwapComplete getDefaultInstanceForType() {
      return com.tdex.v1.SwapComplete.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdex.v1.SwapComplete build() {
      com.tdex.v1.SwapComplete result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdex.v1.SwapComplete buildPartial() {
      com.tdex.v1.SwapComplete result = new com.tdex.v1.SwapComplete(this);
      result.id_ = id_;
      result.acceptId_ = acceptId_;
      result.transaction_ = transaction_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tdex.v1.SwapComplete) {
        return mergeFrom((com.tdex.v1.SwapComplete)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdex.v1.SwapComplete other) {
      if (other == com.tdex.v1.SwapComplete.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getAcceptId().isEmpty()) {
        acceptId_ = other.acceptId_;
        onChanged();
      }
      if (!other.getTransaction().isEmpty()) {
        transaction_ = other.transaction_;
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
      com.tdex.v1.SwapComplete parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdex.v1.SwapComplete) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object acceptId_ = "";
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return The acceptId.
     */
    public java.lang.String getAcceptId() {
      java.lang.Object ref = acceptId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceptId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return The bytes for acceptId.
     */
    public com.google.protobuf.ByteString
        getAcceptIdBytes() {
      java.lang.Object ref = acceptId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acceptId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @param value The acceptId to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      acceptId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptId() {
      
      acceptId_ = getDefaultInstance().getAcceptId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @param value The bytes for acceptId to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      acceptId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transaction_ = "";
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The transaction.
     */
    public java.lang.String getTransaction() {
      java.lang.Object ref = transaction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transaction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The bytes for transaction.
     */
    public com.google.protobuf.ByteString
        getTransactionBytes() {
      java.lang.Object ref = transaction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transaction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransaction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transaction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransaction() {
      
      transaction_ = getDefaultInstance().getTransaction();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The bytes for transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transaction_ = value;
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


    // @@protoc_insertion_point(builder_scope:tdex.v1.SwapComplete)
  }

  // @@protoc_insertion_point(class_scope:tdex.v1.SwapComplete)
  private static final com.tdex.v1.SwapComplete DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdex.v1.SwapComplete();
  }

  public static com.tdex.v1.SwapComplete getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SwapComplete>
      PARSER = new com.google.protobuf.AbstractParser<SwapComplete>() {
    @java.lang.Override
    public SwapComplete parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SwapComplete(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SwapComplete> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SwapComplete> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdex.v1.SwapComplete getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
