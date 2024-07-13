package com.testview

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.TestViewViewManagerInterface
import com.facebook.react.viewmanagers.TestViewViewManagerDelegate

@ReactModule(name = TestViewViewManager.NAME)
class TestViewViewManager : SimpleViewManager<TestViewView>(),
  TestViewViewManagerInterface<TestViewView> {
  private val mDelegate: ViewManagerDelegate<TestViewView>

  init {
    mDelegate = TestViewViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<TestViewView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): TestViewView {
    return TestViewView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: TestViewView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "TestViewView"
  }
}
