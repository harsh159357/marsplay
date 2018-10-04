package com.harsh.marsplayassignment.interfaces;

public interface AssignmentConstants {

    interface Api {
        String CLOUDINARY_MARSPLAY_FOLDER_IMAGES_ENDPOINT
                = "https://api.cloudinary.com/v1_1/harsh159357/resources/image/upload?prefix=marsplay";

        String AUTHORIZATION = "Authorization";
        String BASIC_AUTHORIZATION_SECRET_KEY = "Basic MjQ5NTU3NzU5NTE5Njg3OjI2SWdCeU5LNTJKZjNjT3VrRGdmOVRNZTFSSQ==";
    }

    interface EventCenter {
        int NO_INTERNET_CONNECTION = 0;

        int IMAGE_UPLOADED_SUCCESSFULLY = 100;
        int UNABLE_TO_UPLOAD_IMAGE = 101;


        int NO_IMAGE_UPLOADED_YET = 102;
        int GET_ALL_IMAGE_SUCCESSFUL = 103;
        int UNABLE_TO_GET_ALL_IMAGES = 104;

        interface ClickEvents {
            int ON_UPLOADED_IMAGE_CLICK = 500;
        }
    }

    interface RequestCodes {
        int PICK_IMAGE_FROM_GALLERY_OR_CAMERA = 1000;
        int UPLOAD_IMAGE_TO_CLOUDINARY = 1001;
    }

    String RESOURCE_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
}
