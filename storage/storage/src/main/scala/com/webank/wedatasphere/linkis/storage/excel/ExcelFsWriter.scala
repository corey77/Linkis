/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.storage.excel

import com.webank.wedatasphere.linkis.common.io.FsWriter
import org.apache.poi.ss.usermodel.Workbook

/**
  * Created by johnnwang on 2018/11/12.
  */
abstract class ExcelFsWriter extends FsWriter{
  val charset:String
  val sheetName:String
  val dateFormat:String

  def getWorkBook: Workbook
}

object ExcelFsWriter{
  def getExcelFsWriter(charset:String,sheetName:String,dateFormat:String):ExcelFsWriter = new StorageExcelWriter(charset,sheetName,dateFormat)
}

