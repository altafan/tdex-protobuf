// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/types.proto

package com.tdex.v1;

/**
 * <pre>
 * Custom Types
 * </pre>
 *
 * Protobuf type {@code tdex.v1.Fee}
 */
public  final class Fee extends
    com.google.protobuf.GeneratedMessageLite<
        Fee, Fee.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.Fee)
    FeeOrBuilder {
  private Fee() {
  }
  public static final int BASIS_POINT_FIELD_NUMBER = 2;
  private long basisPoint_;
  /**
   * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
   * @return The basisPoint.
   */
  @java.lang.Override
  public long getBasisPoint() {
    return basisPoint_;
  }
  /**
   * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
   * @param value The basisPoint to set.
   */
  private void setBasisPoint(long value) {
    
    basisPoint_ = value;
  }
  /**
   * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
   */
  private void clearBasisPoint() {
    
    basisPoint_ = 0L;
  }

  public static final int FIXED_FIELD_NUMBER = 3;
  private com.tdex.v1.Fixed fixed_;
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   */
  @java.lang.Override
  public boolean hasFixed() {
    return fixed_ != null;
  }
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   */
  @java.lang.Override
  public com.tdex.v1.Fixed getFixed() {
    return fixed_ == null ? com.tdex.v1.Fixed.getDefaultInstance() : fixed_;
  }
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   */
  private void setFixed(com.tdex.v1.Fixed value) {
    value.getClass();
  fixed_ = value;
    
    }
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeFixed(com.tdex.v1.Fixed value) {
    value.getClass();
  if (fixed_ != null &&
        fixed_ != com.tdex.v1.Fixed.getDefaultInstance()) {
      fixed_ =
        com.tdex.v1.Fixed.newBuilder(fixed_).mergeFrom(value).buildPartial();
    } else {
      fixed_ = value;
    }
    
  }
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   */
  private void clearFixed() {  fixed_ = null;
    
  }

  public static com.tdex.v1.Fee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Fee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Fee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Fee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Fee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Fee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Fee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Fee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Fee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Fee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Fee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Fee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.Fee prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Custom Types
   * </pre>
   *
   * Protobuf type {@code tdex.v1.Fee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.Fee, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.Fee)
      com.tdex.v1.FeeOrBuilder {
    // Construct using com.tdex.v1.Fee.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
     * @return The basisPoint.
     */
    @java.lang.Override
    public long getBasisPoint() {
      return instance.getBasisPoint();
    }
    /**
     * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
     * @param value The basisPoint to set.
     * @return This builder for chaining.
     */
    public Builder setBasisPoint(long value) {
      copyOnWrite();
      instance.setBasisPoint(value);
      return this;
    }
    /**
     * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBasisPoint() {
      copyOnWrite();
      instance.clearBasisPoint();
      return this;
    }

    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    @java.lang.Override
    public boolean hasFixed() {
      return instance.hasFixed();
    }
    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    @java.lang.Override
    public com.tdex.v1.Fixed getFixed() {
      return instance.getFixed();
    }
    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    public Builder setFixed(com.tdex.v1.Fixed value) {
      copyOnWrite();
      instance.setFixed(value);
      return this;
      }
    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    public Builder setFixed(
        com.tdex.v1.Fixed.Builder builderForValue) {
      copyOnWrite();
      instance.setFixed(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    public Builder mergeFixed(com.tdex.v1.Fixed value) {
      copyOnWrite();
      instance.mergeFixed(value);
      return this;
    }
    /**
     * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
     */
    public Builder clearFixed() {  copyOnWrite();
      instance.clearFixed();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.Fee)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.Fee();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "basisPoint_",
            "fixed_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0002\u0003\t" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.Fee> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.Fee.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.Fee>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:tdex.v1.Fee)
  private static final com.tdex.v1.Fee DEFAULT_INSTANCE;
  static {
    Fee defaultInstance = new Fee();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Fee.class, defaultInstance);
  }

  public static com.tdex.v1.Fee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Fee> PARSER;

  public static com.google.protobuf.Parser<Fee> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
