// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.13.0
// source: transport.proto

package transport

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

type TransportType int32

const (
	TransportType_INSECURE TransportType = 0
	TransportType_ONION    TransportType = 1
	TransportType_TLS      TransportType = 2
	TransportType_MTLS     TransportType = 3
	TransportType_NOISE    TransportType = 4
)

// Enum value maps for TransportType.
var (
	TransportType_name = map[int32]string{
		0: "INSECURE",
		1: "ONION",
		2: "TLS",
		3: "MTLS",
		4: "NOISE",
	}
	TransportType_value = map[string]int32{
		"INSECURE": 0,
		"ONION":    1,
		"TLS":      2,
		"MTLS":     3,
		"NOISE":    4,
	}
)

func (x TransportType) Enum() *TransportType {
	p := new(TransportType)
	*p = x
	return p
}

func (x TransportType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (TransportType) Descriptor() protoreflect.EnumDescriptor {
	return file_transport_proto_enumTypes[0].Descriptor()
}

func (TransportType) Type() protoreflect.EnumType {
	return &file_transport_proto_enumTypes[0]
}

func (x TransportType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use TransportType.Descriptor instead.
func (TransportType) EnumDescriptor() ([]byte, []int) {
	return file_transport_proto_rawDescGZIP(), []int{0}
}

type Transport struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type TransportType `protobuf:"varint,1,opt,name=type,proto3,enum=TransportType" json:"type,omitempty"`
	Name string        `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Data []byte        `protobuf:"bytes,3,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *Transport) Reset() {
	*x = Transport{}
	if protoimpl.UnsafeEnabled {
		mi := &file_transport_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Transport) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Transport) ProtoMessage() {}

func (x *Transport) ProtoReflect() protoreflect.Message {
	mi := &file_transport_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Transport.ProtoReflect.Descriptor instead.
func (*Transport) Descriptor() ([]byte, []int) {
	return file_transport_proto_rawDescGZIP(), []int{0}
}

func (x *Transport) GetType() TransportType {
	if x != nil {
		return x.Type
	}
	return TransportType_INSECURE
}

func (x *Transport) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Transport) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

type AvailableTransport struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Transport []TransportType `protobuf:"varint,1,rep,packed,name=transport,proto3,enum=TransportType" json:"transport,omitempty"`
}

func (x *AvailableTransport) Reset() {
	*x = AvailableTransport{}
	if protoimpl.UnsafeEnabled {
		mi := &file_transport_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AvailableTransport) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AvailableTransport) ProtoMessage() {}

func (x *AvailableTransport) ProtoReflect() protoreflect.Message {
	mi := &file_transport_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AvailableTransport.ProtoReflect.Descriptor instead.
func (*AvailableTransport) Descriptor() ([]byte, []int) {
	return file_transport_proto_rawDescGZIP(), []int{1}
}

func (x *AvailableTransport) GetTransport() []TransportType {
	if x != nil {
		return x.Transport
	}
	return nil
}

var File_transport_proto protoreflect.FileDescriptor

var file_transport_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x57, 0x0a, 0x09, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x22,
	0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x0e, 0x2e, 0x54,
	0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x22, 0x42, 0x0a, 0x12, 0x41, 0x76,
	0x61, 0x69, 0x6c, 0x61, 0x62, 0x6c, 0x65, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74,
	0x12, 0x2c, 0x0a, 0x09, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0e, 0x32, 0x0e, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x54,
	0x79, 0x70, 0x65, 0x52, 0x09, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x2a, 0x46,
	0x0a, 0x0d, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12,
	0x0c, 0x0a, 0x08, 0x49, 0x4e, 0x53, 0x45, 0x43, 0x55, 0x52, 0x45, 0x10, 0x00, 0x12, 0x09, 0x0a,
	0x05, 0x4f, 0x4e, 0x49, 0x4f, 0x4e, 0x10, 0x01, 0x12, 0x07, 0x0a, 0x03, 0x54, 0x4c, 0x53, 0x10,
	0x02, 0x12, 0x08, 0x0a, 0x04, 0x4d, 0x54, 0x4c, 0x53, 0x10, 0x03, 0x12, 0x09, 0x0a, 0x05, 0x4e,
	0x4f, 0x49, 0x53, 0x45, 0x10, 0x04, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_transport_proto_rawDescOnce sync.Once
	file_transport_proto_rawDescData = file_transport_proto_rawDesc
)

func file_transport_proto_rawDescGZIP() []byte {
	file_transport_proto_rawDescOnce.Do(func() {
		file_transport_proto_rawDescData = protoimpl.X.CompressGZIP(file_transport_proto_rawDescData)
	})
	return file_transport_proto_rawDescData
}

var file_transport_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_transport_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_transport_proto_goTypes = []interface{}{
	(TransportType)(0),         // 0: TransportType
	(*Transport)(nil),          // 1: Transport
	(*AvailableTransport)(nil), // 2: AvailableTransport
}
var file_transport_proto_depIdxs = []int32{
	0, // 0: Transport.type:type_name -> TransportType
	0, // 1: AvailableTransport.transport:type_name -> TransportType
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_transport_proto_init() }
func file_transport_proto_init() {
	if File_transport_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_transport_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Transport); i {
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
		file_transport_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AvailableTransport); i {
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
			RawDescriptor: file_transport_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_transport_proto_goTypes,
		DependencyIndexes: file_transport_proto_depIdxs,
		EnumInfos:         file_transport_proto_enumTypes,
		MessageInfos:      file_transport_proto_msgTypes,
	}.Build()
	File_transport_proto = out.File
	file_transport_proto_rawDesc = nil
	file_transport_proto_goTypes = nil
	file_transport_proto_depIdxs = nil
}
