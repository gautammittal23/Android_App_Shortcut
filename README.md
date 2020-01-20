# Android_App_Shortcut

#### Official Link [AppShortcut ](https://developer.android.com/guide/topics/ui/shortcuts)


### Add the following to Manifest file 

**Note: Only main activities—activities that handle the Intent.ACTION_MAIN action and the Intent.
CATEGORY_LAUNCHER category—can have shortcuts. If an app has multiple main activities,
you need to define the set of shortcuts for each activity.**

```
     <meta-data
                android:name="android.app.shortcuts"
                android:resource="@xml/shortcut" />
```

###### Creating XML Shortcut Folder

Inside Res Folder Create XML folder, with following sample code
  
  ```
    <shortcut
      android:shortcutId="main"
      android:enabled="true"
      android:icon="@drawable/ic_main"
      android:shortcutShortLabel="@string/shortcutmain">
      <intent
        android:action="android.intent.action.VIEW"
        android:targetPackage="com.appshortcut"
        android:targetClass="com.appshortcut.MainActivity" >
      <extra android:name="shortcutAction" android:value="voice" />     ~~This Tag is required only if you need to perform some task associated with shortcut~~

       </intent>
        <categories android:name="android.shortcut.conversation" />
    </shortcut>
  
  ```
  
  ### Code
  
  Below Code is Written in Activity
  
  ```
        intent?.let {
            if (it.extras != null) {
			// perform task 
            }
        }
        
   ```

  
  
