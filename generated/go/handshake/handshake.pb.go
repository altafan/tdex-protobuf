// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.23.0
// 	protoc        v3.7.1
// source: handshake.proto

package handshake

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

// BOTD#1
type SecretMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Lenght  uint32 `protobuf:"varint,1,opt,name=lenght,proto3" json:"lenght,omitempty"`
	Payload []byte `protobuf:"bytes,2,opt,name=payload,proto3" json:"payload,omitempty"`
}

func (x *SecretMessage) Reset() {
	*x = SecretMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_handshake_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretMessage) ProtoMessage() {}

func (x *SecretMessage) ProtoReflect() protoreflect.Message {
	mi := &file_handshake_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretMessage.ProtoReflect.Descriptor instead.
func (*SecretMessage) Descriptor() ([]byte, []int) {
	return file_handshake_proto_rawDescGZIP(), []int{0}
}

func (x *SecretMessage) GetLenght() uint32 {
	if x != nil {
		return x.Lenght
	}
	return 0
}

func (x *SecretMessage) GetPayload() []byte {
	if x != nil {
		return x.Payload
	}
	return nil
}

// BOTD#2
type Init struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// Secp256k1 Sender's public key
	SenderPubkey []byte `protobuf:"bytes,2,opt,name=sender_pubkey,json=senderPubkey,proto3" json:"sender_pubkey,omitempty"`
	// Secp256k1 Recipient's public key
	RecipientPubkey []byte `protobuf:"bytes,3,opt,name=recipient_pubkey,json=recipientPubkey,proto3" json:"recipient_pubkey,omitempty"`
	// Ephemeral public key generated by the sender
	EphemeralPubkey []byte `protobuf:"bytes,4,opt,name=ephemeral_pubkey,json=ephemeralPubkey,proto3" json:"ephemeral_pubkey,omitempty"`
	// secp256k1 signature of
	// sha256(sender_pubkey,recipient_pubkey,sender_ephemeral_pubkey)
	Signature []byte `protobuf:"bytes,5,opt,name=signature,proto3" json:"signature,omitempty"`
}

func (x *Init) Reset() {
	*x = Init{}
	if protoimpl.UnsafeEnabled {
		mi := &file_handshake_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Init) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Init) ProtoMessage() {}

func (x *Init) ProtoReflect() protoreflect.Message {
	mi := &file_handshake_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Init.ProtoReflect.Descriptor instead.
func (*Init) Descriptor() ([]byte, []int) {
	return file_handshake_proto_rawDescGZIP(), []int{1}
}

func (x *Init) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Init) GetSenderPubkey() []byte {
	if x != nil {
		return x.SenderPubkey
	}
	return nil
}

func (x *Init) GetRecipientPubkey() []byte {
	if x != nil {
		return x.RecipientPubkey
	}
	return nil
}

func (x *Init) GetEphemeralPubkey() []byte {
	if x != nil {
		return x.EphemeralPubkey
	}
	return nil
}

func (x *Init) GetSignature() []byte {
	if x != nil {
		return x.Signature
	}
	return nil
}

type Ack struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// indetifier of the Init message
	InitId string `protobuf:"bytes,2,opt,name=init_id,json=initId,proto3" json:"init_id,omitempty"`
	// Ephemeral public key generated by the recipient
	EphemeralPubkey []byte `protobuf:"bytes,3,opt,name=ephemeral_pubkey,json=ephemeralPubkey,proto3" json:"ephemeral_pubkey,omitempty"`
	// secp256k1 signature of
	// sha256(recipient_pubkey,sender_pubkey,recipient_ephemeral_pubkey)
	Signature []byte `protobuf:"bytes,4,opt,name=signature,proto3" json:"signature,omitempty"`
}

func (x *Ack) Reset() {
	*x = Ack{}
	if protoimpl.UnsafeEnabled {
		mi := &file_handshake_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Ack) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Ack) ProtoMessage() {}

func (x *Ack) ProtoReflect() protoreflect.Message {
	mi := &file_handshake_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Ack.ProtoReflect.Descriptor instead.
func (*Ack) Descriptor() ([]byte, []int) {
	return file_handshake_proto_rawDescGZIP(), []int{2}
}

func (x *Ack) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Ack) GetInitId() string {
	if x != nil {
		return x.InitId
	}
	return ""
}

func (x *Ack) GetEphemeralPubkey() []byte {
	if x != nil {
		return x.EphemeralPubkey
	}
	return nil
}

func (x *Ack) GetSignature() []byte {
	if x != nil {
		return x.Signature
	}
	return nil
}

var File_handshake_proto protoreflect.FileDescriptor

var file_handshake_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x68, 0x61, 0x6e, 0x64, 0x73, 0x68, 0x61, 0x6b, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x41, 0x0a, 0x0d, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x6c, 0x65, 0x6e, 0x67, 0x68, 0x74, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0d, 0x52, 0x06, 0x6c, 0x65, 0x6e, 0x67, 0x68, 0x74, 0x12, 0x18, 0x0a, 0x07, 0x70, 0x61,
	0x79, 0x6c, 0x6f, 0x61, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x07, 0x70, 0x61, 0x79,
	0x6c, 0x6f, 0x61, 0x64, 0x22, 0xaf, 0x01, 0x0a, 0x04, 0x49, 0x6e, 0x69, 0x74, 0x12, 0x0e, 0x0a,
	0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x23, 0x0a,
	0x0d, 0x73, 0x65, 0x6e, 0x64, 0x65, 0x72, 0x5f, 0x70, 0x75, 0x62, 0x6b, 0x65, 0x79, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0c, 0x52, 0x0c, 0x73, 0x65, 0x6e, 0x64, 0x65, 0x72, 0x50, 0x75, 0x62, 0x6b,
	0x65, 0x79, 0x12, 0x29, 0x0a, 0x10, 0x72, 0x65, 0x63, 0x69, 0x70, 0x69, 0x65, 0x6e, 0x74, 0x5f,
	0x70, 0x75, 0x62, 0x6b, 0x65, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0f, 0x72, 0x65,
	0x63, 0x69, 0x70, 0x69, 0x65, 0x6e, 0x74, 0x50, 0x75, 0x62, 0x6b, 0x65, 0x79, 0x12, 0x29, 0x0a,
	0x10, 0x65, 0x70, 0x68, 0x65, 0x6d, 0x65, 0x72, 0x61, 0x6c, 0x5f, 0x70, 0x75, 0x62, 0x6b, 0x65,
	0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0f, 0x65, 0x70, 0x68, 0x65, 0x6d, 0x65, 0x72,
	0x61, 0x6c, 0x50, 0x75, 0x62, 0x6b, 0x65, 0x79, 0x12, 0x1c, 0x0a, 0x09, 0x73, 0x69, 0x67, 0x6e,
	0x61, 0x74, 0x75, 0x72, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x09, 0x73, 0x69, 0x67,
	0x6e, 0x61, 0x74, 0x75, 0x72, 0x65, 0x22, 0x77, 0x0a, 0x03, 0x41, 0x63, 0x6b, 0x12, 0x0e, 0x0a,
	0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x17, 0x0a,
	0x07, 0x69, 0x6e, 0x69, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x69, 0x6e, 0x69, 0x74, 0x49, 0x64, 0x12, 0x29, 0x0a, 0x10, 0x65, 0x70, 0x68, 0x65, 0x6d, 0x65,
	0x72, 0x61, 0x6c, 0x5f, 0x70, 0x75, 0x62, 0x6b, 0x65, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0c,
	0x52, 0x0f, 0x65, 0x70, 0x68, 0x65, 0x6d, 0x65, 0x72, 0x61, 0x6c, 0x50, 0x75, 0x62, 0x6b, 0x65,
	0x79, 0x12, 0x1c, 0x0a, 0x09, 0x73, 0x69, 0x67, 0x6e, 0x61, 0x74, 0x75, 0x72, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x0c, 0x52, 0x09, 0x73, 0x69, 0x67, 0x6e, 0x61, 0x74, 0x75, 0x72, 0x65, 0x42,
	0x3e, 0x5a, 0x3c, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x64,
	0x65, 0x78, 0x2d, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74,
	0x65, 0x64, 0x2f, 0x67, 0x6f, 0x2f, 0x68, 0x61, 0x6e, 0x64, 0x73, 0x68, 0x61, 0x6b, 0x65, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_handshake_proto_rawDescOnce sync.Once
	file_handshake_proto_rawDescData = file_handshake_proto_rawDesc
)

func file_handshake_proto_rawDescGZIP() []byte {
	file_handshake_proto_rawDescOnce.Do(func() {
		file_handshake_proto_rawDescData = protoimpl.X.CompressGZIP(file_handshake_proto_rawDescData)
	})
	return file_handshake_proto_rawDescData
}

var file_handshake_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_handshake_proto_goTypes = []interface{}{
	(*SecretMessage)(nil), // 0: SecretMessage
	(*Init)(nil),          // 1: Init
	(*Ack)(nil),           // 2: Ack
}
var file_handshake_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_handshake_proto_init() }
func file_handshake_proto_init() {
	if File_handshake_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_handshake_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretMessage); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_handshake_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Init); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_handshake_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Ack); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_handshake_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_handshake_proto_goTypes,
		DependencyIndexes: file_handshake_proto_depIdxs,
		MessageInfos:      file_handshake_proto_msgTypes,
	}.Build()
	File_handshake_proto = out.File
	file_handshake_proto_rawDesc = nil
	file_handshake_proto_goTypes = nil
	file_handshake_proto_depIdxs = nil
}