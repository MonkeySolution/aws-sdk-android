/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates an unpredictable byte string.
 * </p>
 */
public class GenerateRandomRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, 1024 and so on. The current limit is 1024 bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, 1024 and so on. The current limit is 1024 bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Integer that contains the number of bytes to generate. Common
     *         values are 128, 256, 512, 1024 and so on. The current limit is
     *         1024 bytes.
     *         </p>
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, 1024 and so on. The current limit is 1024 bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            Integer that contains the number of bytes to generate. Common
     *            values are 128, 256, 512, 1024 and so on. The current limit is
     *            1024 bytes.
     *            </p>
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, 1024 and so on. The current limit is 1024 bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            Integer that contains the number of bytes to generate. Common
     *            values are 128, 256, 512, 1024 and so on. The current limit is
     *            1024 bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: " + getNumberOfBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomRequest == false)
            return false;
        GenerateRandomRequest other = (GenerateRandomRequest) obj;

        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null
                && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        return true;
    }
}
