// "Therefore those skilled at the unorthodox
// are infinite as heaven and earth,
// inexhaustible as the great rivers.
// When they come to an end,
// they begin again,
// like the days and months;
// they die and are reborn,
// like the four seasons."
//
// - Sun Tsu,
// "The Art of War"

package com.theartofdev.edmodo.cropper;

import android.content.Context;

import java.io.File;
import java.util.UUID;

public class CropFileProvider {
  static String authority(Context context) {
    return String.format("%s.image-cropper.provider", context.getPackageName());
  }

  static File cacheDir(Context context) {
    return context.getCacheDir();
  }

  static File cacheFile(Context context, String extension) {
    try {
      return File.createTempFile(UUID.randomUUID().toString(), extension, CropFileProvider.cacheDir(context));
    } catch (Exception ignored) {
      return null;
    }
  }
}
