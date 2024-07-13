#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface TestViewViewManager : RCTViewManager
@end

@implementation TestViewViewManager

RCT_EXPORT_MODULE(TestViewView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
