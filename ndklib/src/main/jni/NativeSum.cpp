#include "com_example_ndklib_NativeWrapper.h"

extern "C" JNIEXPORT jint JNICALL Java_com_example_ndklib_NativeWrapper_nativeSum
(JNIEnv *env, jclass obj, jint a, jint b)
{
     return a+b;
}
