package goxml

import "unsafe"

func boolToByte(b bool) byte {
	return *(*byte)(unsafe.Pointer(&b)) & 1
}

func boolToInt16(b bool) int16 {
	return *(*int16)(unsafe.Pointer(&b)) & 1
}

func boolToInt8(b bool) int8 {
	return *(*int8)(unsafe.Pointer(&b)) & 1
}

func boolToInt(b bool) int {
	return *(*int)(unsafe.Pointer(&b)) & 1
}
