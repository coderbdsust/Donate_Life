package com.project.bluepandora.donatelife.exception;

import android.database.SQLException;

/*
 * Copyright (C) 2014 The Blue Pandora Project Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class SQliteDataBaseException extends SQLException {

    /**
     *
     */
    public static final String DatabaseException_TAG = "DatabaseException";
    private static final long serialVersionUID = 4266329753277016743L;

    @Override
    public String getMessage() {
        return "Problem Occured During BloodDonate Database";
    }
}
