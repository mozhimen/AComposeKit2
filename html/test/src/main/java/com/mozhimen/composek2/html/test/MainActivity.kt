package com.mozhimen.composek2.html.test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import com.ireward.htmlcompose.HtmlText
import com.mozhimen.composek.elems.commons.ICompose_Listener
import com.mozhimen.composek.utils.ui.fromHtml
import com.mozhimen.imagek.glide.impls.ImageGetterGlide
import com.mozhimen.kotlin.utilk.android.util.UtilKLogWrapper
import com.mozhimen.serialk.html.ph_css.utils.inlineStylesWithCssParser
import com.mozhimen.uik.compose.bases.activity.BaseActivityCP

/**
 * @ClassName MainActivity
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/13
 * @Version 1.0
 */
class MainActivity : BaseActivityCP() {
    override fun getContent(): ICompose_Listener = {
        Text(
            text = AnnotatedString.Companion.fromHtml(
                "<div class=\"card\">\n    <div class=\"card-title text-shadow-title\">Top-up Guide</div>\n\n    <div class=\"section-title\">How to Find Your Genshin Impact UID？</div>\n    <div class=\"text-content\">1. Log in to the game of the corresponding server using your account.</div>\n    <div class=\"text-content\">\n        2. Your UID is in the lower right corner of the picture.\n        <img class=\"img\" src=\"https://static-cdn.manabuy.com/yx_20240316110208/manabuy-genshin%20lmpact_20250321152658/1_202503211527.jpg\" alt=\"Genshin Impact UID\">\n    </div>\n\n    <div class=\"section-title\">How to Top Up Genshin Impact on ManaBuy?</div>\n    <div class=\"step\">\n        <div class=\"step-title\">Step 1</div>\n        <div class=\"step-content\">Visit <a style=\"color: #2056f7;text-decoration: underline;\" href=\"https://manabuy.com\">ManaBuy.com</a> and select your language and currency.</div>\n    </div>\n    <div class=\"step\">\n        <div class=\"step-title\">Step 2</div>\n        <div class=\"step-content\">Open the Genshin Impact top-up page, select the product and quantity.</div>\n    </div>\n    <div class=\"step\">\n        <div class=\"step-title\">Step 3</div>\n        <div class=\"step-content\">Enter your Genshin Impact UID and server information and click the <strong>\"Buy Now\"</strong> button.</div>\n    </div>\n    <div class=\"step\">\n        <div class=\"step-title\">Step 4</div>\n        <div class=\"step-content\">Select a payment method to complete the payment. After the recharge is completed, please check whether the product exists in the game account.</div>\n    </div>\n    <div class=\"step\">\n        <div class=\"step-title\">Step 5</div>\n        <div class=\"step-content\">If you encounter any problems, click the customer service button to contact us and we will help you solve it as soon as possible.</div>\n    </div>\n</div>\n<style>\n    .card {\n        background-color: #1a1b29;\n        border-radius: 10px;\n        padding: 20px;\n        margin-bottom: 0px;\n    }\n\n    .card-title {\n        font-family: 'RussoOne' !important;\n        font-size: 22px;\n        line-height: 26px;\n        font-weight: 500;\n    }\n\n    .section-title {\n        font-size: 16px;\n        line-height: 24px;\n        font-weight: 500;\n        margin-top: 20px;\n        margin-bottom: 20px;\n    }\n\n    .text-content {\n        font-size: 16px;\n        line-height: 24px;\n        color: #DADAE9;\n    }\n\n    .step {\n        margin-top: 20px;\n    }\n\n    .step-title {\n        font-weight: 500;\n    }\n\n    .step-content {\n        color: #DADAE9;\n        margin-top: 10px;\n    }\n\n    .img {\n        width: 100%;\n        max-height: 600px;\n        border-radius: 10px;\n        margin: 10px 0;\n        padding: 0 30px;\n        box-sizing: border-box;\n    }\n\n    strong {\n        font-weight: bold;\n    }\n\n    @media (max-width: 768px) {\n        .card-title {\n            font-size: 16px;\n            line-height: 20px;\n        }\n\n        .text-content {\n            margin-top: 10px;\n        }\n\n        .section-title,\n        .text-content,\n        .step-title,\n        .step-content {\n            font-size: 14px;\n            line-height: 20px;\n        }\n\n        .section-title {\n            margin-top: 10px;\n            margin-bottom: 10px;\n        }\n\n        .section-description-title {\n            margin-top: 20px;\n        }\n\n        .img {\n            padding: 10px 14px;\n        }\n\n        .step {\n            margin-top: 10px;\n        }\n\n        .card {\n            margin-bottom: 15px;\n            margin-top: 15px;\n            border-radius: 0px;\n        }\n    }\n</style>\n"
                    .replace("\\n\\n", "<br>").replace("\\n", "<br>").replace("<br><br>", "<br>").replace("\\\"", "\"").replace("<img", "<br><img").inlineStylesWithCssParser().also { UtilKLogWrapper.d(TAG, "text: $it") }
            ),
            modifier = Modifier
                .fillMaxSize()
        )

//        HtmlText()
    }
}