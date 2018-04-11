# bspatch

Step 1. Add the JitPack repository to your build file 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.ZHANGxp123:bspatch:v1.0.0'
	}

方法调用：
BsPatch.bspatch(oldPath, newPath, diffPath); 
oldPath:旧的apk路径
newPath：生成的新apk放置的路径
diffPath：path文件的路径
