import React from 'react';
import {SafeAreaView, StyleSheet} from 'react-native';
import {TestViewView} from 'react-native-test-view';

const App = () => {
  return (
    <SafeAreaView style={styles.container}>
      <TestViewView style={styles.nativeView} />
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  nativeView: {
    width: 100,
    height: 100,
    backgroundColor: 'blue',
  },
});

export default App;
